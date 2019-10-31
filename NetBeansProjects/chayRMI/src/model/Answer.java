/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author ntkhanh
 */
public class Answer implements Serializable {

    static final long serialVersionUID = 2L;
    Student student;

    String reverseStringAnswer;
    String normalizationStringAnswer;
    int maxNumericAnswer;
    int uclnNumericAnswer;
    int bcnnNumericAnswer;
    
    boolean isAlreadyRegistration = false;

    boolean isReverseStringAnswerRight = false;
    boolean isMaxNumericAnswerRight = false;
    boolean isNormalizationStringAnswerRight = false;
    boolean isBSCNNNumericAnswerRight = false;
    boolean isUSCLNNumericAnswerRight = false;

    @Override
    public String toString() {
        return "Answer{" + "student=" + student + ", reverseStringAnswer=" + reverseStringAnswer + ", normalizationStringAnswer=" + normalizationStringAnswer + ", maxNumericAnswer=" + maxNumericAnswer + ", uclnNumericAnswer=" + uclnNumericAnswer + ", bcnnNumericAnswer=" + bcnnNumericAnswer + ", isAlreadyRegistration=" + isAlreadyRegistration + ", isReverseStringAnswerRight=" + isReverseStringAnswerRight + ", isMaxNumericAnswerRight=" + isMaxNumericAnswerRight + ", isNormalizationStringAnswerRight=" + isNormalizationStringAnswerRight + ", isBSCNNNumericAnswerRight=" + isBSCNNNumericAnswerRight + ", isUSCLNNumericAnswerRight=" + isUSCLNNumericAnswerRight + '}';
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setReverseStringAnswer(String reverseStringAnswer) {
        this.reverseStringAnswer = reverseStringAnswer;
    }

    public void setNormalizationStringAnswer(String normalizationStringAnswer) {
        this.normalizationStringAnswer = normalizationStringAnswer;
    }

    public void setMaxNumericAnswer(int maxNumericAnswer) {
        this.maxNumericAnswer = maxNumericAnswer;
    }

    public void setUclnNumericAnswer(int uclnNumericAnswer) {
        this.uclnNumericAnswer = uclnNumericAnswer;
    }

    public void setBcnnNumericAnswer(int bcnnNumericAnswer) {
        this.bcnnNumericAnswer = bcnnNumericAnswer;
    }

    public void setIsAlreadyRegistration(boolean isAlreadyRegistration) {
        this.isAlreadyRegistration = isAlreadyRegistration;
    }

    public void setIsReverseStringAnswerRight(boolean isReverseStringAnswerRight) {
        this.isReverseStringAnswerRight = isReverseStringAnswerRight;
    }

    public void setIsMaxNumericAnswerRight(boolean isMaxNumericAnswerRight) {
        this.isMaxNumericAnswerRight = isMaxNumericAnswerRight;
    }

    public void setIsNormalizationStringAnswerRight(boolean isNormalizationStringAnswerRight) {
        this.isNormalizationStringAnswerRight = isNormalizationStringAnswerRight;
    }

    public void setIsBSCNNNumericAnswerRight(boolean isBSCNNNumericAnswerRight) {
        this.isBSCNNNumericAnswerRight = isBSCNNNumericAnswerRight;
    }

    public void setIsUSCLNNumericAnswerRight(boolean isUSCLNNumericAnswerRight) {
        this.isUSCLNNumericAnswerRight = isUSCLNNumericAnswerRight;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Student getStudent() {
        return student;
    }

    public String getReverseStringAnswer() {
        return reverseStringAnswer;
    }

    public String getNormalizationStringAnswer() {
        return normalizationStringAnswer;
    }

    public int getMaxNumericAnswer() {
        return maxNumericAnswer;
    }

    public int getUclnNumericAnswer() {
        return uclnNumericAnswer;
    }

    public int getBcnnNumericAnswer() {
        return bcnnNumericAnswer;
    }

    public boolean isIsAlreadyRegistration() {
        return isAlreadyRegistration;
    }

    public boolean isIsReverseStringAnswerRight() {
        return isReverseStringAnswerRight;
    }

    public boolean isIsMaxNumericAnswerRight() {
        return isMaxNumericAnswerRight;
    }

    public boolean isIsNormalizationStringAnswerRight() {
        return isNormalizationStringAnswerRight;
    }

    public boolean isIsBSCNNNumericAnswerRight() {
        return isBSCNNNumericAnswerRight;
    }

    public boolean isIsUSCLNNumericAnswerRight() {
        return isUSCLNNumericAnswerRight;
    }

    
  
}
