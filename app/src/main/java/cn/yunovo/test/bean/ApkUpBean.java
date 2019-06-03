package cn.yunovo.test.bean;

import android.os.Parcel;
import android.os.Parcelable;

public class ApkUpBean implements Parcelable {
    private String apkName;
    private String pkgName;
    private String loaclVersion;
    private String netVersion;
    private boolean isNeedUp = false;
    private String downVersionPath;
    private String downApkPath;
    private String downVersionUrl;
    private String downApkUrl;
    //服务器读取的时候大小
    private long netSize;
    //下载在本地之后的大小
    private long localSize;

    public String getApkName() {
        return apkName;
    }

    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    public String getLoaclVersion() {
        return loaclVersion;
    }

    public void setLoaclVersion(String loaclVersion) {
        this.loaclVersion = loaclVersion;
    }

    public String getNetVersion() {
        return netVersion;
    }

    public void setNetVersion(String netVersion) {
        this.netVersion = netVersion;
    }

    public boolean isNeedUp() {
        return isNeedUp;
    }

    public void setNeedUp(boolean needUp) {
        isNeedUp = needUp;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getDownVersionPath() {
        return downVersionPath;
    }

    public void setDownVersionPath(String downVersionPath) {
        this.downVersionPath = downVersionPath;
    }

    public String getDownApkPath() {
        return downApkPath;
    }

    public void setDownApkPath(String downApkPath) {
        this.downApkPath = downApkPath;
    }

    public String getDownVersionUrl() {
        return downVersionUrl;
    }

    public void setDownVersionUrl(String downVersionUrl) {
        this.downVersionUrl = downVersionUrl;
    }

    public String getDownApkUrl() {
        return downApkUrl;
    }

    public void setDownApkUrl(String downApkUrl) {
        this.downApkUrl = downApkUrl;
    }

    public boolean equals(String pkgName) {
        return this.pkgName.equals(pkgName);
    }

    public long getNetSize() {
        return netSize;
    }

    public void setNetSize(long netSize) {
        this.netSize = netSize;
    }

    public long getLocalSize() {
        return localSize;
    }

    public void setLocalSize(long localSize) {
        this.localSize = localSize;
    }

    @Override
    public String toString() {
        return "ApkUpBean{" +
                "apkName='" + apkName + '\'' +
                ", pkgName='" + pkgName + '\'' +
                ", loaclVersion='" + loaclVersion + '\'' +
                ", netVersion='" + netVersion + '\'' +
                ", isNeedUp=" + isNeedUp +
                ", downVersionPath='" + downVersionPath + '\'' +
                ", downApkPath='" + downApkPath + '\'' +
                ", downVersionUrl='" + downVersionUrl + '\'' +
                ", downApkUrl='" + downApkUrl + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.apkName);
        dest.writeString(this.pkgName);
        dest.writeString(this.loaclVersion);
        dest.writeString(this.netVersion);
        dest.writeByte(this.isNeedUp ? (byte) 1 : (byte) 0);
        dest.writeString(this.downVersionPath);
        dest.writeString(this.downApkPath);
        dest.writeString(this.downVersionUrl);
        dest.writeString(this.downApkUrl);
        dest.writeLong(this.netSize);
        dest.writeLong(this.localSize);
    }

    public ApkUpBean() {
    }

    protected ApkUpBean(Parcel in) {
        this.apkName = in.readString();
        this.pkgName = in.readString();
        this.loaclVersion = in.readString();
        this.netVersion = in.readString();
        this.isNeedUp = in.readByte() != 0;
        this.downVersionPath = in.readString();
        this.downApkPath = in.readString();
        this.downVersionUrl = in.readString();
        this.downApkUrl = in.readString();
        this.netSize = in.readLong();
        this.localSize = in.readLong();
    }

    public static final Parcelable.Creator<ApkUpBean> CREATOR = new Parcelable.Creator<ApkUpBean>() {
        @Override
        public ApkUpBean createFromParcel(Parcel source) {
            return new ApkUpBean(source);
        }

        @Override
        public ApkUpBean[] newArray(int size) {
            return new ApkUpBean[size];
        }
    };
}
