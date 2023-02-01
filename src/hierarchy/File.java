package hierarchy;

class File {
    protected String fullName;

    File(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void printFileInfo() {
        String info = this.getFileInfo();
        System.out.println(info);
    }

    protected String getFileInfo() {
        return "File: " + fullName;
    }
}
