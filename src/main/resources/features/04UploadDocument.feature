Feature: Upload Document Page
#Faskes Awal
#01
  Scenario: User click menu foto faskes awal
    When User click button foto faskes awal
    Then User will be directed to upload foto before
#02
  Scenario: User click menu foto faskes awal for cancel
    When User click button foto faskes awal
    And User click button cancel
    Then User will be directed to upload document
#03
  Scenario: User click button save in faskes awal without upload foto
    When User click button foto faskes awal
    And User click button save
    Then User will see validation message
#04
  Scenario: User upload valid foto faskes awal
    When User click button foto faskes awal
    And User click button choose and select valid foto
    Then User will see validation message required
#05
  Scenario: User upload valid foto faskes awal and click cancel
    When User click button foto faskes awal
    And User click button choose and select valid foto
    And User click button cancel
    Then User will be directed to upload document
#06
  Scenario: User upload valid foto faskes awal and click save
    When User click button foto faskes awal
    And User click button choose and select valid foto
    And User click button save
    Then User should see message succesfully uploaded
    And User click button ok

#Faskes Tujuan
#07
  Scenario: User click menu foto faskes tujuan
    When User click button foto faskes tujuan
    Then User will be directed to upload foto after
#8
  Scenario: User click menu foto faskes tujuan for cancel
    When User click button foto faskes tujuan
    And User click button cancel
    Then User will be directed to upload document
#9
  Scenario: User click button save in faskes tujuan without upload foto
    When User click button foto faskes tujuan
    And User click button save
    Then User will see validation message
#10
  Scenario: User upload valid foto faskes tujuan
    When User click button foto faskes tujuan
    And User click button choose and select valid foto
    Then User will see validation message required
#11
  Scenario: User upload valid foto faskes tujuan and click cancel
    When User click button foto faskes tujuan
    And User click button choose and select valid foto
    And User click button cancel
    Then User will be directed to upload document
#12
  Scenario: User upload valid foto faskes tujuan and click save
    When User click button foto faskes tujuan
    And User click button choose and select valid foto
    And User click button save
    Then User should see message succesfully uploaded
    And User click button ok

#Tanda Tangan Digital(TTD)
#13
  Scenario: User click menu foto TTD
    When User click button TTD
    Then User will be directed to upload TTD
#14
  Scenario: User click menu TTD for cancel
    When User click button TTD
    And User click button cancel
    Then User will be directed to upload document
#15
  Scenario: User click button save in TTD without upload foto
    When User click button TTD
    And User click button save
    Then User will see validation message
#16
  Scenario: User upload valid foto TTD
    When User click button TTD
    And User click button choose and select valid foto
    Then User will see validation message required
#17
  Scenario: User upload valid foto TTD and click cancel
    When User click button TTD
    And User click button choose and select valid foto
    And User click button cancel
    Then User will be directed to upload document
#18
  Scenario: User upload valid foto TTD and click save
    When User click button TTD
    And User click button choose and select valid foto
    And User click button save
    Then User should see message succesfully uploaded
    And User click button ok

#Button Simpan
#19
  Scenario: User click button next(selanjutnya)
    When User click button selanjutnya
    And User Click OK in alert message
    Then User will be directed to tanda tangan digital tab

#  Scenario: Upload Document with invavalid document
#    When User click button foto faskes awal
#    And User click button choose and select valid foto faskes awal
#    And User click button save
#    Then User should see message succesfully uploaded
#    And User click button ok
#    And User click button foto faskes tujuan
#    And User click button choose and select valid foto faskes tujuan
#    And User click button save
#    Then User should see message succesfully uploaded
#    And User click button ok
#    And User click button TTD
#    And User click button choose and select valid foto TTD
#    And User click button save
#    Then User should see message succesfully uploaded
#    And User click button ok
#    And User click button selanjutnya
#    And User Click OK in alert message
#    Then User will be directed to tanda tangan digital tab