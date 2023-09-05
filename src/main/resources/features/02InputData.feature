Feature: Input Data page
  Scenario: Input Data with valid data
    When User click button input
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

