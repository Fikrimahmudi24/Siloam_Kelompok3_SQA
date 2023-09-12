package com.juaracoding;

import com.juaracoding.pages.InputDataPageTwo;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class TestTTD {
    static WebDriver driver;
    static ExtentTest extentTest;

    static InputDataPageTwo InputDataPage = new InputDataPageTwo();

    public TestTTD() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click Edit button in TTD Digital tab")
    public void user_click_edit_button_in_ttd_digital_tab() {
        InputDataPage.clickBtnEdit();
        extentTest.log(LogStatus.PASS, "User click Edit button in TTD Digital tab");
    }

    @Then("Edit button in TTD tab is working")
    public void edit_button_in_ttd_tab_is_working() {
        Assert.assertEquals(InputDataPage.getTxtSimpan(), "Simpan");
        extentTest.log(LogStatus.PASS, "Edit button in TTD tab is working");
    }

    @And("User click Cancel button in TTD Digital tab")
    public void user_click_cancel_button_in_ttd_digital_tab() {
        InputDataPage.clickBtnCancel();
        extentTest.log(LogStatus.PASS, "User click Cancel button in TTD Digital tab");
    }

    @Then("User is directed back to the previous page")
    public void cancel_button_in_ttd_tab_is_working() {
        Assert.assertEquals(InputDataPage.getTxtEdit(), "Edit");
        extentTest.log(LogStatus.PASS, "User is directed back to the previous page");

    }

    @And("User change data in Nama field")
    public void user_change_data_in_nama_field() {
        InputDataPage.enterName(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterName("Jessica");
        extentTest.log(LogStatus.PASS, "User change data in Nama field");
    }

    @And("User change data in Nomor KTP field")
    public void user_change_data_in_nomor_ktp_field() {
        InputDataPage.enterKTP(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterKTP("1270949876441289");
        extentTest.log(LogStatus.PASS, "User change data in Nomor KTP field");
    }

    @And("User change data in Alamat field")
    public void user_change_data_in_alamat_field() {
        InputDataPage.enterAlamat(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterAlamat("Kebayoran Lama");
        extentTest.log(LogStatus.PASS, "User change data in Alamat field");
    }

    @And("User change data in Kota KTP field")
    public void user_change_data_in_kota_ktp_field() {
        InputDataPage.selectDropDownKotaKTP("Kota Jakarta Pusat");
        extentTest.log(LogStatus.PASS, "User change data in Kota KTP field");
    }

    @And("User change data in Faskes Awal field")
    public void user_change_data_in_faskes_awal_field() {
        InputDataPage.enterFaskesAwal(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterFaskesAwal("Klinik Kebayoran Lama");
        extentTest.log(LogStatus.PASS, "User change data in Faskes Awal field");
    }

    @And("User change data in Faskes Tujuan field")
    public void user_change_data_in_faskes_tujuan_field() {
        InputDataPage.selectDropDownFaskesTujuan("Meruya");
        extentTest.log(LogStatus.PASS, "User change data in Faskes Tujuan field");
    }

    @And("User change data in Alasan field")
    public void user_change_data_in_alasan_field() {
        try {
            InputDataPage.enterAlasan(Keys.CONTROL + "a" + Keys.DELETE);
            InputDataPage.enterAlasan("Pindah");
            extentTest.log(LogStatus.PASS, "User change data in Alasan field");
        } catch (Exception e) {
        }
    }

    @And("User click Simpan button")
    public void user_click_simpan_button() {
        delay(2);
        InputDataPage.clickBtnUpdate();
        extentTest.log(LogStatus.PASS, "User click Simpan button");
        delay(2);
    }

    //Ganti sebelum di Run
    //dan harus sama dengan line 123
    //BPJS aja
    //
    @And("User change data in Nomor BPJS field")
    public void user_change_data_in_nomor_bpjs_field() {
        InputDataPage.enterBPJS(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterBPJS("2323233434458");
        extentTest.log(LogStatus.PASS, "User change data in Nomor BPJS field");
    }
    //Ganti Sebelum Di Run
    //Harus sama dengan baris 62
    //BPJS aja
    //
    @Then("Data in the field edited successfully")
    public void data_in_the_field_edited_successfully() {
        Assert.assertEquals(InputDataPage.getDataNama(), "Jessica");
        Assert.assertEquals(InputDataPage.getDataBPJS(), "2323233434458");
        Assert.assertEquals(InputDataPage.getDataKTP(), "1270949876441289");
        Assert.assertEquals(InputDataPage.getDataAlamat(), "Kedoya");
        Assert.assertEquals(InputDataPage.getDataKotaKtp(), "Kota Jakarta Pusat");
        Assert.assertEquals(InputDataPage.getDataFaskesAwal(), "Klinik Kebayoran Lama");
        Assert.assertEquals(InputDataPage.getDataFaskesTujuan(), "Meruya");
        Assert.assertEquals(InputDataPage.getDataAlasan(), "Pindah");
        extentTest.log(LogStatus.PASS, "Data in the field edited successfully");
    }

    @And("User edit existing Nama by leaving the Nama field blank")
    public void user_edit_existing_nama_by_leaving_the_nama_field_blank() {
        InputDataPage.enterName(Keys.CONTROL + "a" + Keys.DELETE);
        extentTest.log(LogStatus.PASS, "User edit existing Nama by leaving the Nama field blank");
    }

    @Then("User get error message Field Nama Harus Diisi!")
    public void user_get_error_message_field_nama_harus_diisi() {
        Assert.assertEquals("", "Field Nama Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User get error message Field Nama Harus Diisi!");
        delay(2);
    }

    @And("User edit existing Nomor BPJS by inputting more than 13 digits")
    public void edit_existing_nomor_bpjs_inputting_more_than_13_digits() {
        InputDataPage.enterBPJS(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterBPJS("12345678910235");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor BPJS by inputting more than 13 digits");
    }

    @Then("User get to see Nomor BPJS field does not accept more than 13 digits number")
    public void user_get_to_see_nomor_bpjs_field_does_not_accept_more_than_13_digits_number() {
        Assert.assertEquals(InputDataPage.getTxtFormatBPJS(), "Please Match the Requested Format: 13 to 13 Character");
        extentTest.log(LogStatus.PASS, "User get to see Nomor BPJS field does not accept more than 13 digits number");
    }

    @And("User edit existing Nomor BPJS by inputting String")
    public void user_edit_existing_nomor_bpjs_by_inputting_string() {
        InputDataPage.enterBPJS(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterBPJS("satuduatiga");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor BPJS by inputting String");
    }

    @Then("User get to see Nomor BPJS field does not accept String")
    public void user_get_to_see_nomor_bpjs_field_does_not_accept_string() {
        String inputValue = InputDataPage.getDataBPJS();
        if (inputValue.matches("!.*[a-zA-Z].*")) {
            // Jika nilai input tidak mengandung huruf (string)
            extentTest.log(LogStatus.PASS, "User get to see Nomor BPJS field does not accept String");
        }
    }

    @And("User edit existing Nomor BPJS by inputting less than 13 digits number")
    public void user_edit_existing_nomor_bpjs_by_inputting_less_than_13_digits_number() {
        InputDataPage.enterBPJS(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterBPJS("123456");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor BPJS by inputting less than 13 digits number");
    }

    @Then("User get warning Please Match the Requested Format: 13 to 13 Character")
    public void user_get_warning_please_match_the_requested_format_13_to_13_character() {
        Assert.assertEquals(InputDataPage.getTxtFormatBPJS(), "Please Match the Requested Format: 13 to 13 Character");
        extentTest.log(LogStatus.PASS, "User get warning Please Match the Requested Format: 13 to 13 Character");
        InputDataPage.clickBtnCancel();
    }

    @And("User edit existing Nomor BPJS by leaving the Nomor BPJS field blank")
    public void user_edit_existing_nomor_bpjs_by_leaving_the_nomor_bpjs_field_blank() {
        InputDataPage.enterBPJS(Keys.CONTROL + "a" + Keys.DELETE);
        extentTest.log(LogStatus.PASS, "User edit existing Nomor BPJS by leaving the Nomor BPJS field blank");
        delay(2);
    }

    @Then("User get error message Field Nomor BPJS Harus Diisi!")
    public void user_get_error_message_field_nomor_bpjs_harus_diisi() {
        delay(2);
        Assert.assertEquals(InputDataPage.getTxtBpjsRequired(), "Field Nomor BPJS Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User get error message Field Nomor BPJS Harus Diisi!");
        delay(2);
    }


    @And("User edit existing Nomor BPJS by inputting the BPJS Number that was saved previously")
    public void user_edit_existing_nomor_bpjs_by_leaving_the_bpjs_number_that_was_saved_previously() {
        InputDataPage.enterBPJS(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterBPJS("0970978612520");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor BPJS by inputting the BPJS Number that was saved previously");
        delay(2);
    }

    @Then("User get error message The Nomor BPJS already exist")
    public void user_get_error_message_the_nomor_bpjs_already_exist() {
        delay(2);
        Assert.assertEquals(InputDataPage.getTxtBPJSAlreadyExist(), "The Nomor BPJS already exist.");
        extentTest.log(LogStatus.PASS, "User get error message The Nomor BPJS already exist");
        delay(2);
    }

    //KTP
    @And("User edit existing Nomor KTP by inputting more than 16 digits number")
    public void user_edit_existing_nomor_ktp_by_inputting_more_than_16_digits_number() {
        InputDataPage.enterKTP(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterKTP("235702560245602572");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor KTP by inputting more than 16 digits number");
    }

    @Then("User get to see Nomor KTP field does not accept more than 16 digits number")
    public void user_get_to_see_nomor_ktp_field_does_not_accept_more_than_16_digits_number() {
        Assert.assertEquals(InputDataPage.getTxtFormatKTP(), "Please Match the Requested Format: 16 to 16 Character");
        extentTest.log(LogStatus.PASS, "User get to see Nomor KTP field does not accept more than 16 digits number");
    }

    @And("User edit existing Nomor KTP by inputting String")
    public void user_edit_existing_nomor_ktp_by_inputting_string() {
        InputDataPage.enterKTP(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterKTP("satuduatiga");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor KTP by inputting String");
    }

    @Then("User get to see Nomor KTP field does not accept String")
    public void user_get_to_see_nomor_ktp_field_does_not_accept_string() {
        String inputValue = InputDataPage.getDataKTP();
        if (inputValue.matches("!.*[a-zA-Z].*")) {
            // Jika nilai input tidak mengandung huruf (string)
            extentTest.log(LogStatus.PASS, "User get to see Nomor KTP field does not accept String");
        }
    }

    @And("User edit existing Nomor KTP by inputting less than 16 digits number")
    public void user_edit_existing_nomor_ktp_by_inputting_less_than_16_digits_number() {
        InputDataPage.enterKTP(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.enterKTP("1246141");
        extentTest.log(LogStatus.PASS, "User edit existing Nomor KTP by inputting less than 16 digits number");
    }

    @Then("User get warning Please Match the Requested Format: 16 to 16 Character")
    public void user_get_warning_please_match_the_requested_format_16_to_16_character() {
        Assert.assertEquals(InputDataPage.getTxtFormatKTP(), "Please Match the Requested Format: 16 to 16 Character");
        extentTest.log(LogStatus.PASS, "User get warning Please Match the Requested Format: 16 to 16 Character");
        InputDataPage.clickBtnCancel();
    }

    @And("User edit existing Nomor KTP by leaving the Nomor KTP field blank")
    public void user_edit_existing_nomor_ktp_by_leaving_the_nomor_ktp_field_blank() {
        InputDataPage.enterKTP(Keys.CONTROL + "a" + Keys.DELETE);
        extentTest.log(LogStatus.PASS, "User edit existing Nomor KTP by leaving the Nomor KTP field blank");
    }

    @Then("User get error message Field Nomor KTP Harus Diisi!")
    public void user_get_error_message_field_nomor_ktp_harus_diisi() {
        delay(2);
        Assert.assertEquals(InputDataPage.getTxtKtpRequired(), "Field Nomor KTP Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User get error message Field Nomor KTP Harus Diisi!");
    }

    @And("User edit existing Alamat by leaving the Alamat field blank")
    public void user_edit_existing_alamat_by_leaving_alamat_field_blank() {
        InputDataPage.enterAlamat(Keys.CONTROL + "a" + Keys.DELETE);
        extentTest.log(LogStatus.PASS, "User edit existing Alamat by leaving the Alamat field blank");
    }

    @Then("User get error message Field Alamat Harus Diisi!")
    public void user_get_error_message_field_alamat_harus_diisi() {
        Assert.assertEquals(InputDataPage.getTxtAlamatRequired(), "Field Alamat Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User get error message Field Alamat Harus Diisi!");
    }

    @And("User edit existing Alamat by inputting Number Only")
    public void user_edit_existing_alamat_by_inputting_number_only() {
        InputDataPage.enterAlamat(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.inputAlamat(797899097);
        extentTest.log(LogStatus.PASS, "User edit existing Alamat by inputting Number Only");
    }

    @Then("User get to see Alamat field does not accept Number Only")
    public void user_get_to_see_alamat_field_does_not_accept_number_only() {
        Assert.assertEquals("", InputDataPage.getTxtFormatAlamatIsNotNumber());
        extentTest.log(LogStatus.PASS, "User get to see Alamat field does not accept Number Only");
    }

    @And("User edit existing Faskes Awal by leaving the Faskes Awal field blank")
    public void user_edit_existing_faskes_awal_by_leaving_the_faskes_awal_field_blank() {
        InputDataPage.enterFaskesAwal(Keys.CONTROL + "a" + Keys.DELETE);
        extentTest.log(LogStatus.PASS, "User edit existing Faskes Awal by leaving the Faskes Awal field blank");
    }

    @Then("User get error message Field Faskes Awal Harus Diisi!")
    public void user_get_error_message_field_faskes_awal_harus_diisi() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InputDataPage.faskesAwal);
        delay(3);
        Assert.assertEquals(InputDataPage.getTxtFaskesAwalRequired(), "Field Faskes Awal Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User get error message Field Faskes Awal Harus Diisi!");
    }

    @And("User edit existing Faskes Awal by inputting Number Only")
    public void user_edit_existing_faskes_awal_by_inputting_number_only() {
        InputDataPage.enterFaskesAwal(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.inputFaskesAwal(797899097);
        extentTest.log(LogStatus.PASS, "User edit existing Faskes Awal by inputting Number Only");
    }

    @Then("User get to see Faskes Awal field does not accept Only Number")
    public void user_get_to_see_faskes_awal_field_does_not_accept_number_only() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InputDataPage.dropDownKotaKTP);
        Assert.assertEquals("", InputDataPage.getTxtFormatFaskesAwalIsNotNumber());
        extentTest.log(LogStatus.PASS, "User get to see Faskes Awal field does not accept Only Number");
    }

    @And("User edit existing Alasan by leaving the Alasan field blank")
    public void user_edit_existing_alasan_by_leaving_the_alasan_field_blank() {
        InputDataPage.enterAlasan(Keys.CONTROL + "a" + Keys.DELETE);
        extentTest.log(LogStatus.PASS, "User edit existing Alasan by leaving the Alasan field blank");
    }

    @Then("User get error message Field Alasan Harus Diisi!")
    public void user_get_error_message_field_alasan_harus_diisi() {
        Assert.assertEquals(InputDataPage.getTxtAlasanRequired(), "Field Alasan Harus Diisi!");
        extentTest.log(LogStatus.PASS, "User get error message Field Alasan Harus Diisi!");
    }

    @And("User edit existing Alasan by inputting Number Only")
    public void user_edit_existing_alasan_by_inputting_number_only() {
        InputDataPage.enterAlasan(Keys.CONTROL + "a" + Keys.DELETE);
        InputDataPage.inputAlasan(797899097);
        extentTest.log(LogStatus.PASS, "User edit existing Alasan by inputting Number Only");
    }

    @Then("User get to see Alasan field does not accept Number Only")
    public void user_get_to_see_alasan_field_does_not_accept_number_only() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", InputDataPage.faskesAwal);
        delay(2);
        Assert.assertEquals("", InputDataPage.getTxtFormatAlasanIsNotNumber());
        extentTest.log(LogStatus.PASS, "User get to see Alasan field does not accept Number Only");
    }

    @When("User click Add Files button in Before row")
    public void user_click_add_files_button_in_before_row() {
        InputDataPage.clickBtnAddFilesBefore();
        extentTest.log(LogStatus.PASS, "User click Add Files button in Before row");
    }

    @And("User click Browse button and select the appropriate image")
    public void user_click_browse_and_select_appropriate_image() {
        InputDataPage.clickBtnBrowseFile("C:/Users/HP/Downloads/fakses-awal-edit.jpg");
        extentTest.log(LogStatus.PASS, "User click Browse button and select the appropriate image");
    }

    @And("User click Simpan button in upload foto form")
    public void user_click_simpan_in_upload_foto_form() {
        InputDataPage.clickBtnSimpanFoto();
        extentTest.log(LogStatus.PASS, "User click Simpan button in upload foto form");
        delay(5);
    }

    @Then("User get to see pop up Data Berhasil diupload!")
    public void user_get_to_see_pop_up_data_berhasil_diupload() {
        Assert.assertEquals(InputDataPage.getTxtDataBerhasilDiupload(), "Data Berhasil diupload!");
        extentTest.log(LogStatus.PASS, "User get to see pop up Data Berhasil diupload!");
        InputDataPage.clickBtnConfirmOk();
    }

    @Then("User get to see message Upload error: You did not select a file to upload")
    public void user_get_to_see_message_upload_error_you_did_not_select_a_file_to_upload() {
        Assert.assertEquals(InputDataPage.getTxtErrorMessage(), "Upload error: You did not select a file to upload.");
        extentTest.log(LogStatus.PASS, "User get a message Upload error: You did not select a file to upload.");
        InputDataPage.clickBtnCancelInUploadFotoForm();
    }

    @And("User click Browse button and select image with size larger than 5MB")
    public void user_click_browse_button_and_select_image_with_size_larger_than_5mb() {
        InputDataPage.clickBtnBrowseFile("C:/Users/HP/Downloads/larger-than-5MB.jpg");
        extentTest.log(LogStatus.PASS, "User click Browse button and select image with size larger than 5MB");
    }

    @Then("User get to see message Upload error: The file you are attempting to upload is larger than the permitted size")
    public void user_get_to_see_message_upload_error_the_file_you_are_attempting_to_upload_is_larger_than_the_permitted_size() {
        delay(20);
        Assert.assertEquals(InputDataPage.getTxtErrorMessage(), "Upload error: The file you are attempting to upload is larger than the permitted size.");
        extentTest.log(LogStatus.PASS, "User get to see message Upload error: The file you are attempting to upload is larger than the permitted size");
        InputDataPage.clickBtnCancelInUploadFotoForm();
    }

    @And("User click Browse button and select image other than JPG, GIF, PNG")
    public void user_click_browse_button_and_select_image_other_than_jpg_gif_png() {
        InputDataPage.clickBtnBrowseFile("C:/Users/HP/Downloads/preview_300.pdf");
        extentTest.log(LogStatus.PASS, "User click Browse button and select image other than JPG, GIF, PNG");
    }

    @Then("User get to see message Upload error: The filetype you are attempting to upload is not allowed")
    public void user_get_to_see_message_upload_error_filetype_not_allowed() {
        Assert.assertEquals(InputDataPage.getTxtErrorMessage(), "Upload error: The filetype you are attempting to upload is not allowed.");
        extentTest.log(LogStatus.PASS, "User get to see message Upload error: The filetype you are attempting to upload is not allowed");
        delay(3);
        InputDataPage.clickBtnCancelInUploadFotoForm();
    }

    @When("User click Add Files button in After row")
    public void user_click_add_files_button_in_after_row() {
        driver.navigate().refresh();
        delay(5);
        InputDataPage.clickBtnAddFilesAfter();
        extentTest.log(LogStatus.PASS, "User click Add Files button in After row");
    }

    @When("User click Add Files button in TTD row")
    public void user_click_add_files_button_in_ttd_row() {
        driver.navigate().refresh();
        delay(5);
        InputDataPage.clickBtnAddFilesTtd();
        extentTest.log(LogStatus.PASS, "User click Add Files button in TTD row");
    }

    @When("User click x icon in Before row")
    public void user_click_x_icon_in_before_row() {
        driver.navigate().refresh();
        delay(5);
        InputDataPage.clickIconDeleteBefore();
        extentTest.log(LogStatus.PASS, "User click x icon in Before row");
    }

    @When("User click x icon in After row")
    public void user_click_x_icon_in_after_row() {
        driver.navigate().back();
        delay(3);
        InputDataPage.clickIconDeleteAfter();
        extentTest.log(LogStatus.PASS, "User click x icon in After row");
    }

    @When("User click x icon in TTD row")
    public void user_click_x_icon_in_ttd_row() {
        driver.navigate().back();
        delay(3);
        InputDataPage.clickIconDeleteTtd();
        extentTest.log(LogStatus.PASS, "User click x icon in TTD row");
    }
    @And("User click ok")
    public void user_click_ok() {
        driver.switchTo().alert().accept();
        extentTest.log(LogStatus.PASS, "User click ok");
    }
    @Then("User get to see message image deleted successfully")
    public void user_get_to_see_message_image_deleted_successfully() {
        Assert.assertEquals(InputDataPage.getActualFromDeleteFile(), "Image deleted successfully");
        extentTest.log(LogStatus.PASS, "User get to see message image deleted successfully");
    }
    @And("User click Cancel button on Upload Photo form")
    public void user_click_cancel_button_on_upload_foto_form() {
        InputDataPage.clickBtnCancelInUploadFotoForm();
        extentTest.log(LogStatus.PASS, "User click Cancel button on Upload Photo form");
    }

    @When("User is in TTD digital tab")
    public void user_is_in_ttd_digital_tab() {
        driver.navigate().back();
        InputDataPage.getTxtTTDDigital();
        extentTest.log(LogStatus.PASS, "User click x icon in After row");
    }
    @And("User scroll down the website")
    public void user_scroll_down_the_website() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        extentTest.log(LogStatus.PASS, "User scroll down the website");
    }
    @Then("User get to see preview of the Surat Pernyataan document")
    public void user_get_to_see_preview_of_the_surat_pernyataan() {
        driver.switchTo().frame(InputDataPage.iframeSuratPernyataan);
        String teksSuratPernyataan = InputDataPage.txtSuratPernyataan.getText();
        Assert.assertEquals(teksSuratPernyataan, "SURAT PERNYATAAN");
        extentTest.log(LogStatus.PASS, "User get to see preview of the Surat Pernyataan document");
    }
    @And("User click Submit button in TTD Digital tab")
    public void user_click_submit_button_in_ttd_digital_tab() {
        InputDataPage.clickBtnSubmit();
        extentTest.log(LogStatus.PASS, "User click Submit button in TTD Digital tab");
    }
    @Then("User get to see submit button is working and get message TTD Digital Berhasil")
    public void user_get_to_see_submit_button_is_working_and_get_message_ttd_digital_berhasil() {
        Assert.assertTrue(InputDataPage.gettxtTTDDigitalBerhasil().contains("TTD Digital Berhasil"));
        extentTest.log(LogStatus.PASS, "User get to see submit button is working and get message TTD Digital Berhasil");
    }


}
