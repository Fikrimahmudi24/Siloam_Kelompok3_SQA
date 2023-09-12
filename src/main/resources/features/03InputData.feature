Feature: Input Data page
#01
  Scenario: User access Input Data menu
    When User login
    And User click button input data
    Then User redirect to form input
#02
  Scenario: User check field visibility
    When User click button input data
    And User check and scroll form input
    Then User redirect to form input
#03
  Scenario: Input Data with invalid data in the nama
    When User click button input for blank text
    And User leaving the nama field blank
    And User input valid nomor bpjs
    And User input valid nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see warning text in the nama
#04
  Scenario: Input number <13 character to nomor bpjs
    When User click button input for blank text
    And User input valid nama
    And User input 12 character to nomor bpjs
    And User input valid nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see warning character text in the nomor bpjs
#05
  Scenario: Input number <16 character to nomor KTP
    When User click button input for blank text
    And User input valid nama
    And User input valid nomor bpjs
    And User input 15 character to nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see warning character text in the nomor ktp
#06
  Scenario: Input Data with invalid data in the nomor bpjs
    When User click button input for blank text
    And User input valid nama
    And User leaving the nomor bpjs field blank
    And User input valid nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see warning text in the nomor bpjs
#07
  Scenario: Input Data with invalid data in the nomor KTP
    When User click button input for blank text
    And User input valid nama
    And User input valid nomor bpjs
    And User leaving the nomor KTP field blank
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see warning text in the nomor KTP
#08
  Scenario: Input Data with invalid data in the alamat
    When User click button input for blank text
    And User input valid nama
    And User input valid nomor bpjs
    And User input valid nomor ktp
    And User leaving the alamat field blank
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see validation text in the alamat
#09
  Scenario: Input Data with invalid data in the kota KTP
    When User click button input for blank text
    And User input valid nama
    And User input valid nomor bpjs
    And User input valid nomor ktp
    And User input valid alamat
    And User leaving the kota KTP field blank
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see validation text in the kota KTP
#10
  Scenario: Input Data with invalid data in the faskes awal
    When User click button input for blank text
    And User input valid nama
    And User input valid nomor bpjs
    And User input valid nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User leaving the faskes awal field blank
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see warning text in the faskes awal
#11
  Scenario: User check list in kota KTP
    When User click button input for blank text
    And User input valid kota ktp
    Then User should see text kota in the kota KTP
#12
  Scenario: User check list in faskes tujuan
    When User click button input data
    And User input valid faskes tujuan
    Then User should see text kota in the faskes tujuan
#13
  Scenario: Input Data with invalid data in the faskes tujuan
    When User click button input for blank text
    And User input valid nama
    And User input valid nomor bpjs
    And User input valid nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User leaving the faskes tujuan field blank
    And User click button simpan data
    Then User should see warning text in the faskes tujuan
#14
#  Valid Automation
  Scenario: Input Data with valid data
    When User click button input data
    And User input valid nama
    And User input valid nomor bpjs
    And User input valid nomor ktp
    And User input valid alamat
    And User input valid kota ktp
    And User input valid faskes awal
    And User input valid faskes tujuan
    And User input alasan
    And User click button simpan data
    Then User should see validation

