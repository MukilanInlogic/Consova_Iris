package demotest.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageUI {


    protected final WebDriver driver;

    public HomePageUI(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    protected String strLeftPaneHeaderLocator = new StringBuilder("//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();

    protected String strLeftPaneSubHeaderLocator = new StringBuilder("//div[@id='ctl01_LeftMainMenu']//a[contains(text(),'")
            .append("<<REPLACE>>")
            .append("')]").toString();


    @FindBy(how = How.XPATH, using = "//img[@alt='Consova']")
    protected WebElement lblConsova;

    @FindBy(how = How.XPATH, using = "//input[@id='username']")
    protected WebElement txtBoxUserNameInIRIS;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    protected WebElement txtBoxPasswordInIRIS;

    @FindBy(how = How.XPATH, using = "//button[text()='Log In']")
    protected WebElement btnLoginInIRIS;

    @FindBy(how = How.XPATH, using = "//button[@disabled='']")
    protected WebElement btnLoginInIRISDisable;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'logout_icon')]")
    protected WebElement btnLogout;

    @FindBy(how = How.XPATH, using = "//a[@title='Consova']")
    protected WebElement lblHomepage;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'text-danger')]")
    protected WebElement invalidLoginMessage;

    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    protected WebElement btnPopupButton;

    @FindBy(how = How.XPATH, using = "//a[text()='Privacy Policy']")
    protected WebElement linkPrivacyPolicy;

    @FindBy(how = How.XPATH, using = "//h2[text()='Privacy Policy']")
    protected WebElement privacyPolicyTab;

    @FindBy(how = How.XPATH, using = "//span[text()=' Forgot Password?']")
    protected WebElement linkForgetPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='emailAddress']")
    protected WebElement txtBoxEmailAddress;

    @FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
    protected WebElement btnCancel;

    @FindBy(how = How.XPATH, using = "//button[text()='Send Password Email']")
    protected WebElement btnSendEmail;

    @FindBy(how = How.XPATH, using = "//button[text()='OK']")
    protected WebElement btnOk;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'ui-tabview-title')]")
    protected List<WebElement> listHeadingTab;

    @FindBy(how = How.XPATH, using = "//div[text()='Audit(s) Selected:']")
    protected WebElement activeAuditCount;

    @FindBy(how = How.XPATH, using = "//div[text()='Total Employee Count:']")
    protected WebElement TotalEmployeeCount;

    @FindBy(how = How.XPATH, using = "//div[text()='Total Dependent Count:']")
    protected WebElement TotalDependentCount;

    @FindBy(how = How.XPATH, using = "//input[@role='combobox']")
    protected WebElement txtBoxSearch;

    @FindBy(how = How.XPATH, using = "//li[contains(@class,'ui-autocomplete-list-item')]")
    protected List<WebElement> dropdownSuggestion;

    @FindBy(how = How.XPATH, using = "//span[@class='font-weight-bold']")
    protected WebElement FullNameInAccount;

    @FindBy(how = How.XPATH, using = "//label[text()='SSN']")
    protected WebElement sSNInAccount;

    @FindBy(how = How.XPATH, using = "//label[text()='Employee Id']")
    protected WebElement employeeIdInAccount;

    @FindBy(how = How.XPATH, using = "//label[text()='Date of Birth']")
    protected WebElement dOBInAccount;

    @FindBy(how = How.XPATH, using = "//label[text()='Gender']")
    protected WebElement genderInAccount;

    @FindBy(how = How.XPATH, using = "//label[text()='Address']")
    protected WebElement addressInAccount;

    @FindBy(how = How.XPATH, using = "//strong[text()='Home']")
    protected WebElement homePhoneInAccount;

    @FindBy(how = How.XPATH, using = "//strong[text()='Mobile']")
    protected WebElement mobilePhoneInAccount;

    @FindBy(how = How.XPATH, using = "//strong[text()='Work']")
    protected WebElement workPhoneInAccount;

    @FindBy(how = How.XPATH, using = "//strong[text()='Email']")
    protected WebElement emailInAccount;

    @FindBy(how = How.XPATH, using = "//strong[text()='Preferred email']")
    protected WebElement preferredEmailInAccount;

    @FindBy(how = How.XPATH, using = "//label[text()='Consova PIN']")
    protected WebElement lblConsovaPINInAccount;

    @FindBy(how = How.XPATH, using = "//div[@class='shadow-box d-flex flex-wrap']//div//strong")
    protected List<WebElement> consovaPINInAccount;

    @FindBy(how = How.XPATH, using = "//span[@class='menu_icon report_icon']")
    protected WebElement reportIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Standard Report']")
    protected WebElement standardReportIcon;

    @FindBy(how = How.XPATH, using = "//span[text()='Custom Reports']")
    protected WebElement customReportIcon;

    @FindBy(how = How.XPATH, using = "//button[text()='Complete']")
    protected WebElement CompleteInStandardReport;

    @FindBy(how = How.XPATH, using = "//button[text()='Incomplete']")
    protected WebElement IncompleteInStandardReport;

    @FindBy(how = How.XPATH, using = "//button[text()='In Process']")
    protected WebElement InProcessInStandardReport;

    @FindBy(how = How.XPATH, using = "//button[text()='Non Responder']")
    protected WebElement NonResponderInStandardReport;

    @FindBy(how = How.XPATH, using = "//button[text()='Ineligible']")
    protected WebElement IneligibleInStandardReport;

    @FindBy(how = How.XPATH, using = "//p[text()='A password reset link has been sent to your Email']")
    protected WebElement messageSentVerification;

    @FindBy(how = How.XPATH, using = "//div[text()='There is no user found having the provided email']")
    protected WebElement noUserFoundVerification;

    @FindBy(how = How.XPATH, using = "//img[contains(@class,'userInitial')]")
    protected WebElement profileIcon;

    @FindBy(how = How.XPATH, using = "//button[text()='Change Password']")
    protected WebElement btnChangePassword;

    @FindBy(how = How.ID, using = "currentPassword")
    protected WebElement txtboxCurrentPassword;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Enter New Password']")
    protected WebElement txtboxNewPassword;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Confirm Password']")
    protected WebElement txtboxConfirmNewPassword;

    @FindBy(how = How.XPATH, using = "//div[@class='sticky-section']//button[text()='Change Password']")
    protected WebElement btnChangePasswordInPopup;

    @FindBy(how = How.XPATH, using = "//button[text()='Save Password']")
    protected WebElement btnSavePasswordInPopup;

    @FindBy(how = How.XPATH, using = "//input[contains(@class,'filter-input-element')]")
    protected List<WebElement> filterTxtboxInStandardReport;

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'EmployeeId')]")
    protected List<WebElement> selectFirstEmployeeDisplayed;

    @FindBy(how = How.XPATH, using = "//li[@role='presentation']")
    protected List<WebElement> individualComponents;

    @FindBy(how = How.XPATH, using = "//button[text()='Admin Ticket']")
    protected WebElement btnAdminTicket;

    @FindBy(how = How.XPATH, using = "//select[@formcontrolname='adminTicketType']")
    protected WebElement btnTicketReason;

    @FindBy(how = How.XPATH, using = "//option[text()='Employee audit Inquiry']")
    protected WebElement firstTicketReason;

    @FindBy(how = How.XPATH, using = "//option[text()='Request call recording']")
    protected WebElement secondTicketReason;

    @FindBy(how = How.XPATH, using = "//option[text()='Update employee contact information']")
    protected WebElement thirdTicketReason;

    @FindBy(how = How.XPATH, using = "//option[text()='Update demographic information']")
    protected WebElement fourthTicketReason;

    @FindBy(how = How.XPATH, using = "//select[@formcontrolname='dependentAudit']")
    protected WebElement auditsInAdminTicket;

    @FindBy(how = How.XPATH, using = "//select[@formcontrolname='dependentAudit']//option")
    protected List<WebElement> listAuditsInAdminTicket;

    @FindBy(how = How.XPATH, using = "//button[text()='Submit']")
    protected WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//textarea[@formcontrolname='adminTicketComment']")
    protected WebElement TxtboxComments;

    @FindBy(how = How.XPATH, using = "//p-multiselect[@formcontrolname='selectedDependent']")
    protected WebElement selectDependent;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'ui-chkbox-box')]")
    protected WebElement checkSelectAll;

    @FindBy(how = How.XPATH, using = "//th[contains(text(),'Ticket')]")
    protected List<WebElement> ticketHeaderSort;

    @FindBy(how = How.XPATH, using = "//span[contains(@class,'pull-right')]")
    protected List<WebElement> ticketNumber;

    @FindBy(how = How.NAME, using = "commentsText")
    protected WebElement commentsBox;

    @FindBy(how = How.XPATH, using = "//button[text()='Save']")
    protected WebElement btnSave;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'circle')]")
    protected WebElement closeModal;

    @FindBy(how = How.ID, using = "logout")
    protected WebElement LogoutInDropdown;

    @FindBy(how = How.XPATH, using = "//span[text()='Assigned to Consova']")
    protected WebElement btnAssignedToConsova;

    @FindBy(how = How.XPATH, using = "//span[text()='Assigned to Walmart']")
    protected WebElement btnAssignedToClient;

    @FindBy(how = How.XPATH, using = "//span[text()='Resolved']")
    protected WebElement btnResolved;

    @FindBy(how = How.XPATH, using = "//th[text()=' Consova PIN ']")
    protected List<WebElement> headerConsovaPIN;

    @FindBy(how = How.XPATH, using = "//th[text()=' Employee Name ']")
    protected List<WebElement> headerEmployeeName;

    @FindBy(how = How.XPATH, using = "//th[text()=' Audit Date ']")
    protected List<WebElement> headerAuditDate;

    @FindBy(how = How.XPATH, using = "//th[text()=' Dependent Name ']")
    protected List<WebElement> headerDependentName;

    @FindBy(how = How.XPATH, using = "//th[text()=' Last Comment ']")
    protected List<WebElement> headerLastComment;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'View Ticket')]")
    protected WebElement btnViewTicket;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'ui-tabpanel')]")
    protected List<WebElement> AuditDependentsInSeperateTab;

    @FindBy(how = How.XPATH, using = "//input[@name='loginfmt']")
    protected WebElement usernameInOutlook;

    @FindBy(how = How.ID, using = "passwordInput")
    protected WebElement passwordInOutlook;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    protected WebElement nextButtonInOutlook;

    @FindBy(how = How.XPATH, using = "//div[@title='Outlook']")
    protected WebElement outlookIcon;

    @FindBy(how = How.ID, using = "submitButton")
    protected WebElement loginButtonInOutlook;

    @FindBy(how = How.ID, using = "idSIButton9")
    protected WebElement yesFromPopupInOutlook;

    @FindBy(how = How.XPATH, using = "//span[text()='Password Reset']")
    protected WebElement activationEmail;

    @FindBy(how = How.XPATH, using = "//span[text()='Other']")
    protected WebElement otersTabInOutlook;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'iverifypro.consova.com')]")
    protected WebElement activationLink;

}