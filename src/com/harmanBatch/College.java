package com.harmanBatch;

abstract class College {
    abstract  void setAcademicFee(); //Hidden from others
}
class CSE_Dept extends College{

    void setAcademicFee(){
        System.out.print("100000");
    }
}
class ME_Dept extends College{

    void setAcademicFee(){
        System.out.println("75000");
    }
}
class CollegeOffice {

    public static void main(String[]args) {
        College ob_cse=new CSE_Dept();
        College ob_me=new ME_Dept();
        System.out.println("CSE Dept Fee Structure");
        ob_cse.setAcademicFee();
        System.out.println("ME Dept Fee Structures");
        ob_me.setAcademicFee();

    }
}
