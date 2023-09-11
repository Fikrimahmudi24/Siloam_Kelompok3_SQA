Feature: Tab TTD digital

  Scenario: User click Cancel button in TTD Digital tab
    When User click Edit button in TTD Digital tab
    And User click Cancel button in TTD Digital tab
    Then User is directed back to the previous page

  Scenario: User click Edit button in TTD Digital tab
    When User click Edit button in TTD Digital tab
    Then Edit button in TTD tab is working

  Scenario: User edit existing Nama by leaving the Nama field blank
    When User edit existing Nama by leaving the Nama field blank
    And User click Simpan button
    Then User get error message Field Nama Harus Diisi!

  Scenario: User edit existing Nomor BPJS by inputting more than 13 digits number
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor BPJS by inputting more than 13 digits
    And User click Simpan button
    Then User get to see Nomor BPJS field does not accept more than 13 digits number

  Scenario: User edit existing Nomor BPJS by inputting String
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor BPJS by inputting String
    And User click Simpan button
    Then User get to see Nomor BPJS field does not accept String

  Scenario: User edit existing Nomor BPJS by inputting less than 13 digits number
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor BPJS by inputting less than 13 digits number
    And User click Simpan button
    Then User get warning Please Match the Requested Format: 13 to 13 Character

  Scenario: User edit existing Nomor BPJS by leaving the Nomor BPJS field blank
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor BPJS by leaving the Nomor BPJS field blank
    And User click Simpan button
    Then User get error message Field Nomor BPJS Harus Diisi!

  Scenario: User edit existing Nomor BPJS by inputting the BPJS Number that was saved previously
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor BPJS by inputting the BPJS Number that was saved previously
    And User click Simpan button
    Then User get error message The Nomor BPJS already exist

  Scenario: User edit existing Nomor KTP by inputting more than 16 digits number
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor KTP by inputting more than 16 digits number
    And User click Simpan button
    Then User get to see Nomor KTP field does not accept more than 16 digits number

  Scenario: User edit existing Nomor KTP by inputting String
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor KTP by inputting String
    And User click Simpan button
    Then User get to see Nomor KTP field does not accept String

  Scenario: User edit existing Nomor KTP by inputting less than 16 digits number
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor KTP by inputting less than 16 digits number
    And User click Simpan button
    Then User get warning Please Match the Requested Format: 16 to 16 Character

  Scenario: User edit existing Nomor KTP by leaving the Nomor KTP field blank
    When User click Edit button in TTD Digital tab
    And User edit existing Nomor KTP by leaving the Nomor KTP field blank
    And User click Simpan button
    Then User get error message Field Nomor KTP Harus Diisi!

  Scenario: User edit existing Alamat by leaving the Alamat field blank
    When User click Edit button in TTD Digital tab
    And User edit existing Alamat by leaving the Alamat field blank
    And User click Simpan button
    Then User get error message Field Alamat Harus Diisi!

  Scenario: User edit existing Alamat by inputting Number Only
    When User click Edit button in TTD Digital tab
    And User edit existing Alamat by inputting Number Only
    And User click Simpan button
    Then User get to see Alamat field does not accept Number Only

  Scenario: User edit existing Faskes Awal by leaving the Faskes Awal field blank
    When User click Edit button in TTD Digital tab
    And User edit existing Faskes Awal by leaving the Faskes Awal field blank
    And User click Simpan button
    Then User get error message Field Faskes Awal Harus Diisi!

  Scenario: User edit existing Faskes Awal by inputting Number Only
    When User click Edit button in TTD Digital tab
    And User edit existing Faskes Awal by inputting Number Only
    And User click Simpan button
    Then User get to see Faskes Awal field does not accept Only Number

  Scenario: User edit existing Alasan by leaving the Alasan field blank
    When User click Edit button in TTD Digital tab
    And User edit existing Alasan by leaving the Alasan field blank
    And User click Simpan button
    Then User get error message Field Alasan Harus Diisi!

  Scenario: User edit existing Alasan by inputting Number Only
    When User click Edit button in TTD Digital tab
    And User edit existing Alasan by inputting Number Only
    And User click Simpan button
    Then User get to see Alasan field does not accept Number Only

  Scenario: User edit existing data with valid input
    When User click Edit button in TTD Digital tab
    And User change data in Nama field
    And User change data in Nomor BPJS field
    And User change data in Nomor KTP field
    And User change data in Alamat field
    And User change data in Kota KTP field
    And User change data in Faskes Awal field
    And User change data in Faskes Tujuan field
    And User change data in Alasan field
    And User click Simpan button
    Then Data in the field edited successfully

  Scenario: User edit existing image by uploading appropriate image in the Before document
    When User click Add Files button in Before row
    And User click Browse button and select the appropriate image
    And User click Simpan button in upload foto form
    Then User get to see pop up Data Berhasil diupload!

  Scenario: User edit existing image by leaving the Upload Foto Before form blank in the Before document
    When User click Add Files button in Before row
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: You did not select a file to upload

  Scenario: User edit existing image by uploading image file with size larger than 5MB in the Before document
    When User click Add Files button in Before row
    And User click Browse button and select image with size larger than 5MB
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: The file you are attempting to upload is larger than the permitted size

  Scenario: User edit existing image by uploading image file other than JPG, GIF, PNG in the Before document
    When User click Add Files button in Before row
    And User click Browse button and select image other than JPG, GIF, PNG
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: The filetype you are attempting to upload is not allowed

  Scenario: User edit existing image by uploading appropriate image in the After document
    When User click Add Files button in After row
    And User click Browse button and select the appropriate image
    And User click Simpan button in upload foto form
    Then User get to see pop up Data Berhasil diupload!

  Scenario: User edit existing image by leaving the Upload Foto After form blank in the After document
    When User click Add Files button in After row
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: You did not select a file to upload

  Scenario: User edit existing image by uploading image file with size larger than 5MB in the After document
    When User click Add Files button in After row
    And User click Browse button and select image with size larger than 5MB
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: The file you are attempting to upload is larger than the permitted size

  Scenario: User edit existing image by uploading image file other than JPG, GIF, PNG in the After document
    When User click Add Files button in After row
    And User click Browse button and select image other than JPG, GIF, PNG
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: The filetype you are attempting to upload is not allowed

  Scenario: User edit existing image by uploading appropriate image in the TTD document
    When User click Add Files button in TTD row
    And User click Browse button and select the appropriate image
    And User click Simpan button in upload foto form
    Then User get to see pop up Data Berhasil diupload!

  Scenario: User edit existing image by leaving the Upload Foto TTD form blank in the TTD document
    When User click Add Files button in TTD row
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: You did not select a file to upload

  Scenario: User edit existing image by uploading image file with size larger than 5MB in the TTD document
    When User click Add Files button in TTD row
    And User click Browse button and select image with size larger than 5MB
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: The file you are attempting to upload is larger than the permitted size

  Scenario: User edit existing image by uploading image file other than JPG, GIF, PNG in the TTD document
    When User click Add Files button in TTD row
    And User click Browse button and select image other than JPG, GIF, PNG
    And User click Simpan button in upload foto form
    Then User get to see message Upload error: The filetype you are attempting to upload is not allowed

  Scenario: User click Cancel button on Upload Photo Before form
    When User click Add Files button in Before row
    And  User click Cancel button on Upload Photo form
    Then User is directed back to the previous page

  Scenario: User click Cancel button on Upload Photo After form
    When User click Add Files button in After row
    And  User click Cancel button on Upload Photo form
    Then User is directed back to the previous page

  Scenario: User click Cancel button on Upload Photo TTD form
    When User click Add Files button in TTD row
    And  User click Cancel button on Upload Photo form
    Then User is directed back to the previous page

  Scenario: User delete existing image in the Before document
    When User click x icon in Before row
    And User click ok
    Then User get to see message image deleted successfully

  Scenario: User delete existing image in the After document
    When User click x icon in After row
    And User click ok
    Then User get to see message image deleted successfully

  Scenario: User delete existing image in the TTD document
    When User click x icon in TTD row
    And User click ok
    Then User get to see message image deleted successfully

  Scenario: User see the preview of the Surat Pernyataan document
    When User is in TTD digital tab
    And User scroll down the website
    Then User get to see preview of the Surat Pernyataan document

  Scenario: User click Submit button in TTD Digital tab
    When User is in TTD digital tab
    And User scroll down the website
    And User click Submit button in TTD Digital tab
    And User click ok
    Then User get to see submit button is working and get message TTD Digital Berhasil






