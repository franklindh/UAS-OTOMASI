import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://genesis.dutatani.id/si_petani/login.php?pesan=Mohon%20Login')

WebUI.setText(findTestObject('Object Repository/Page_/input_ID User_id_user (1)'), 'tester_otomasi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password (1)'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg (1)'))

WebUI.click(findTestObject('Object Repository/Page_/a_Pendataan Petani'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Id User_id_user (2)'), id_user)

WebUI.setText(findTestObject('Object Repository/Page_/input_Nama Petani_nama_petani'), nama_petani)

WebUI.setText(findTestObject('Object Repository/Page_/input_Nama Istri  Suami_nama_istri'), nama_istri / suami)

WebUI.setText(findTestObject('Object Repository/Page_/input_Alamat Petani_alamat_petani'), alamat_petani)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Provinsi                            _919ea7'), 
    provinsi, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_KabupatenKABUPATEN BANTULKABUPATEN G_999db8'), 
    kabupaten, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_KecamatanSRANDAKANSANDENKRETEKPUNDON_96a685'), 
    kecamatan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Desa  KelurahanGADINGHARJOGADINGSARI_6dbf1c'), 
    desa / kelurahan, true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Nomor Telepon_nomor_telpon'), no_telepon)

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Lahan_jml_lahan'), jumlah_lahan)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_SD                                  _d31312'), 
    pendidikan_terakhir, true)

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Tanggungan_jumlah_tanggungan'), jumlah_tanggungan)

WebUI.setText(findTestObject('Object Repository/Page_/input_Jumlah Tenaga Kerja Musiman_jml_tng_k_49b205'), jumlah_tenagakerjamusiman)

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_email'), email)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_Islam                               _f363b0'), 
    agama, true)

WebUI.setText(findTestObject('Object Repository/Page_/textarea_Deskripsi Keahlian_deskripsi_keahlian'), deskripsi_keahlihan)

WebUI.click(findTestObject('Object Repository/Page_/input_Aktif_status'))

WebUI.click(findTestObject('Object Repository/Page_/input_Laki-laki_jenis_kelamin'))

WebUI.click(findTestObject('Object Repository/Page_/input_Password_btn btn-primary btn-lg (1)'))

