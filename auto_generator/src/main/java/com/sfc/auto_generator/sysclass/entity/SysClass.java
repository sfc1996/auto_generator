package com.sfc.auto_generator.sysclass.entity;

import java.time.LocalDateTime;
import com.sfc.auto_generator.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author sufuchuan
 * @since 2019-09-15
 */
public class SysClass extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer classId;

    private String className;

    private String classDesc;

    private Integer classNumber;

    private Integer classMaster;

    private Integer grade;

    private Integer classScore;

    private LocalDateTime startTime;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String getClassDesc() {
        return classDesc;
    }

    public void setClassDesc(String classDesc) {
        this.classDesc = classDesc;
    }
    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }
    public Integer getClassMaster() {
        return classMaster;
    }

    public void setClassMaster(Integer classMaster) {
        this.classMaster = classMaster;
    }
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    public Integer getClassScore() {
        return classScore;
    }

    public void setClassScore(Integer classScore) {
        this.classScore = classScore;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public static final String CLASS_ID = "class_id";

    public static final String CLASS_NAME = "class_name";

    public static final String CLASS_DESC = "class_desc";

    public static final String CLASS_NUMBER = "class_number";

    public static final String CLASS_MASTER = "class_master";

    public static final String GRADE = "grade";

    public static final String CLASS_SCORE = "class_score";

    public static final String START_TIME = "start_time";

    @Override
    public String toString() {
        return "SysClass{" +
            "classId=" + classId +
            ", className=" + className +
            ", classDesc=" + classDesc +
            ", classNumber=" + classNumber +
            ", classMaster=" + classMaster +
            ", grade=" + grade +
            ", classScore=" + classScore +
            ", startTime=" + startTime +
        "}";
    }
}
