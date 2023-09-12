package com.juaracoding.utils;

public enum TestCases {

    //Modul 1(Login and Logout)
    T1("User access invalid url"),
    T2("User access valid url"),
    T3("Login admin no username and password"),
    T4("Login admin with valid username and invalid password"),
    T5("Login admin with invalid username and valid password"),
    T6("Login admin with valid username"),
    T7("Login admin with invalid username"),
    T8("Login admin with valid password"),
    T9("Login admin with invalid password"),
    T10("Login admin with valid username and password"),
    T11("Logout admin"),
    T12("User access invalid url"),
    T13("User access valid url"),
    T14("Login sales no username and password"),
    T15("Login sales with valid username and invalid password"),
    T16("Login sales with invalid username and valid password"),
    T17("Login sales with valid username"),
    T18("Login sales with invalid username"),
    T19("Login sales with valid password"),
    T20("Login sales with invalid password"),
    T21("Login sales with valid username and password"),
    T22("Logout sales"),

    //Modul 2(View Export Admin Account)
    T23 ("View and export admin"),
    T24 ("View and export for check calender admin"),
    T25 ("View and export input valid start date admin"),
    T26 ("View and export with invalid letter start date admin"),
    T27 ("View and export with invalid number start date admin"),
    T28("View and export with valid end date admin"),
    T29("View and export with invalid letter end date admin"),
    T30("View and export with invalid number start date admin"),
    T31("View and export button filter with valid data admin"),
    T32("View and export button filter with invalid data admin"),
    T33("User click filter after without fill to end date field admin"),

    //Modul 3(Input Data)
    T57("User access Input Data menu"),
    T58("User check field visibility"),
    T59("Input Data with invalid data in the nama"),
    T60("Input number <13 character to nomor bpjs"),
    T61("Input number <16 character to nomor KTP"),
    T62("Input Data with invalid data in the nomor bpjs"),
    T63("Input Data with invalid data in the nomor KTP"),
    T64("Input Data with invalid data in the alamat"),
    T65("Input Data with invalid data in the kota KTP"),
    T66("Input Data with invalid data in the faskes awal"),
    T67("User check list in kota KTP"),
    T68("Input Data with invalid data in the faskes tujuan"),


    T69("User check list in faskes tujuan"),
    T70("Input Data with valid data"),

    //Faskes Awal
    T71("User click menu foto faskes awal"),
    //negative
    T72("User click menu foto faskes awal for cancel"),
    T73("User click button save in faskes awal without upload foto"),
    T74("User upload valid foto faskes awal"),
    T75("User upload valid foto faskes awal and click cancel"),
    T76("User upload valid foto faskes awal and click save"),

    //Faskes Tujuan/Akhir
    T77("User click menu foto faskes tujuan"),
    T78("User click menu foto faskes tujuan for cancel"),
    T79("User click button save in faskes tujuan without upload foto"),
    T80("User upload valid foto faskes tujuan"),
    T81("User upload valid foto faskes tujuan and click cancel"),
    T82("User upload valid foto faskes tujuan and click save"),

    //Tanda Tangan Digital (TTD)
    T83("User click menu foto TTD"),
    T84("User click menu TTD for cancel"),
    T85("User click button save in TTD without upload foto"),
    T86("User upload valid foto TTD"),
    T87("User upload valid foto TTD and click cancel"),
    T88("User upload valid foto TTD and click save"),
    T89("User click button next(selanjutnya)"),

    //Modul 5 (Tanda Tangan Digital)
    T90("User click Cancel button in TTD Digital tab"),
    T91("User click Edit button in TTD Digital tab"),
    T92("User edit existing Nama by leaving the Nama field blank"),
    T93("User edit existing Nomor BPJS by inputting more than 13 digits number"),
    T94("User edit existing Nomor BPJS by inputting String"),
    T95("User edit existing Nomor BPJS by inputting less than 13 digits number"),
    T96("User edit existing Nomor BPJS by leaving the Nomor BPJS field blank"),
    T97("User edit existing Nomor BPJS by inputting the BPJS Number that was saved previously"),
    T98("User edit existing Nomor KTP by inputting more than 16 digits number"),
    T99("User edit existing Nomor KTP by inputting String"),
    T100("User edit existing Nomor KTP by inputting less than 16 digits number"),
    T101("User edit existing Nomor KTP by leaving the Nomor KTP field blank"),
    T102("User edit existing Alamat by leaving the Alamat field blank"),
    T103("User edit existing Alamat by inputting Number Only"),
    T104("User edit existing Faskes Awal by leaving the Faskes Awal field blank"),
    T105("User edit existing Faskes Awal by inputting Number Only"),
    T106("User edit existing Alasan by leaving the Alasan field blank"),
    T107("User edit existing Alasan by inputting Number Only"),
    T108("User edit existing data with valid input"),
    T109("User edit existing image by uploading appropriate image in the Before document"),
    T110("User edit existing image by leaving the Upload Foto Before form blank in the Before document"),
    T111("User edit existing image by uploading image file with size larger than 5MB in the Before document"),
    T112("User edit existing image by uploading image file other than JPG, GIF, PNG in the Before document"),
    T113("User edit existing image by uploading appropriate image in the After document"),
    T114("User edit existing image by leaving the Upload Foto After form blank in the After document"),
    T115(" User edit existing image by uploading image file with size larger than 5MB in the After document"),
    T116("User edit existing image by uploading image file other than JPG, GIF, PNG in the After document"),
    T117("User edit existing image by uploading appropriate image in the TTD document"),
    T118("User edit existing image by leaving the Upload Foto TTD form blank in the TTD document"),
    T119("User edit existing image by uploading image file with size larger than 5MB in the TTD document"),
    T120("User edit existing image by uploading image file other than JPG, GIF, PNG in the TTD document"),
    T121("User click Cancel button on Upload Photo Before form"),
    T122("User click Cancel button on Upload Photo After form"),
    T123("User click Cancel button on Upload Photo TTD form"),
    T124("User delete existing image in the Before document"),
    T125("User delete existing image in the After document"),
    T126("User delete existing image in the TTD document"),
    T127("User see the preview of the Surat Pernyataan document"),
    T128("User click Submit button in TTD Digital tab"),
    T129("User access menu return"),
    T130("User display valid data"),
    T131("User display back date"),
    T132("User reset date data"),
    T133("User display all data per rows entries"),
    T134("User search data by name"),
    T135("User search invalid data by name"),
    T136("User reset field search"),
    T137("User direct to menu upload document"),
    T138("User display the second page in the data table"),
    T139("User display the next page in the data table"),
    ;



    private String testCaseName;
    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){

        return testCaseName;
    }
}
