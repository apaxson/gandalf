/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.svpworldwide.netops.techutil;

/**
 *
 * @author aaron.paxson
 */
public class Computer {
    public static final String OS_NAME = "os.name";
    public static final String OS_VERSION = "os.version";
    public static final String FILE_SEP = "file.separator";
    public static final String CUR_USER = "user.name";
    public static final String USER_HOME = "user.home";
    private String os_name;
    private String os_version;
    private String file_sep;
    private String current_user;
    private String user_home;
    private String mcafeeLogPath;
    private String ciscoDesktopAgentPath;
    private String ciscoVPNPath;
    private String lotusNotesPath;
    
    //TODO Include Citrix Paths.  This code will not work with Citrix
    
    private boolean windows7 = false;
    private boolean windowsXP = false;
    private boolean mac = false;
    
    public void Computer() {
        this.setCurrent_user(System.getProperty(CUR_USER));
        this.setFile_sep(System.getProperty(FILE_SEP));
        this.setOs_name(System.getProperty(OS_NAME));
        this.setOs_version(System.getProperty(OS_VERSION));
        if (this.getOs_name().equalsIgnoreCase("windows7")) {
            this.setWindows7(true);
            this.setCiscoDesktopAgentPath("C:\\Program Files\\Cisco\\Desktop");
            this.setCiscoVPNPath("C:\\Program Files\\Cisco Systems\\VPN Client");
        }
        if (this.getOs_name().equalsIgnoreCase("mac")) {
            this.setMac(true);
        }
        if (this.getOs_name().equalsIgnoreCase("windowsxp")) {
            this.setWindowsXP(true);
            this.setCiscoDesktopAgentPath("C:\\Program Files\\Cisco\\Desktop");
        }
    }

    /**
     * @return the os_name
     */
    public String getOs_name() {
        return os_name;
    }

    /**
     * @param os_name the os_name to set
     */
    public void setOs_name(String os_name) {
        this.os_name = os_name;
    }

    /**
     * @return the os_version
     */
    public String getOs_version() {
        return os_version;
    }

    /**
     * @param os_version the os_version to set
     */
    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    /**
     * @return the file_sep
     */
    public String getFile_sep() {
        return file_sep;
    }

    /**
     * @param file_sep the file_sep to set
     */
    public void setFile_sep(String file_sep) {
        this.file_sep = file_sep;
    }

    /**
     * @return the current_user
     */
    public String getCurrent_user() {
        return current_user;
    }

    /**
     * @param current_user the current_user to set
     */
    public void setCurrent_user(String current_user) {
        this.current_user = current_user;
    }

    /**
     * @return the user_home
     */
    public String getUser_home() {
        return user_home;
    }

    /**
     * @param user_home the user_home to set
     */
    public void setUser_home(String user_home) {
        this.user_home = user_home;
    }

    /**
     * @return the windows7
     */
    public boolean isWindows7() {
        return windows7;
    }

    /**
     * @param windows7 the windows7 to set
     */
    public void setWindows7(boolean windows7) {
        this.windows7 = windows7;
    }

    /**
     * @return the windowsXP
     */
    public boolean isWindowsXP() {
        return windowsXP;
    }

    /**
     * @param windowsXP the windowsXP to set
     */
    public void setWindowsXP(boolean windowsXP) {
        this.windowsXP = windowsXP;
    }

    /**
     * @return the mac
     */
    public boolean isMac() {
        return mac;
    }

    /**
     * @param mac the mac to set
     */
    public void setMac(boolean mac) {
        this.mac = mac;
    }

    /**
     * @return the mcafeeLogPath
     */
    public String getMcafeeLogPath() {
        return mcafeeLogPath;
    }

    /**
     * @param mcafeeLogPath the mcafeeLogPath to set
     */
    public void setMcafeeLogPath(String mcafeeLogPath) {
        this.mcafeeLogPath = mcafeeLogPath;
    }

    /**
     * @return the ciscoDesktopAgentPath
     */
    public String getCiscoDesktopAgentPath() {
        return ciscoDesktopAgentPath;
    }

    /**
     * @param ciscoDesktopAgentPath the ciscoDesktopAgentPath to set
     */
    public void setCiscoDesktopAgentPath(String ciscoDesktopAgentPath) {
        this.ciscoDesktopAgentPath = ciscoDesktopAgentPath;
    }

    /**
     * @return the ciscoVPNPath
     */
    public String getCiscoVPNPath() {
        return ciscoVPNPath;
    }

    /**
     * @param ciscoVPNPath the ciscoVPNPath to set
     */
    public void setCiscoVPNPath(String ciscoVPNPath) {
        this.ciscoVPNPath = ciscoVPNPath;
    }

    /**
     * @return the lotusNotesPath
     */
    public String getLotusNotesPath() {
        return lotusNotesPath;
    }

    /**
     * @param lotusNotesPath the lotusNotesPath to set
     */
    public void setLotusNotesPath(String lotusNotesPath) {
        this.lotusNotesPath = lotusNotesPath;
    }
}
