package demotest.action;

import com.sun.jna.platform.unix.X11;
import commonpage.toolbox.*;
import commonpage.util.TestdataConstants;
import demotest.Repository.HomePageUI;
import javafx.scene.control.Tab;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class HomePageActions extends HomePageUI {
    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    public ArrayList<String> tabs_windows;

    public boolean enterURL(String url) {
        boolean isEntered = false;
        Sync.Delay(3000);
        if (driver!=null) {
            driver.get(url);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyLoginpage() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (lblConsova.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean EnterUserName(String strUsername) {
        boolean isEntered = false;
        if (txtBoxUserNameInIRIS.isDisplayed()) {
            Textbox.enterValue(driver,txtBoxUserNameInIRIS,strUsername);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean EnterPassword(String strPassword) {
        boolean isEntered = false;
        if (txtBoxPasswordInIRIS.isDisplayed()) {
            Textbox.enterValue(driver,txtBoxPasswordInIRIS,strPassword);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean btnLoginInIRISDisable() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (!btnLoginInIRIS.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean btnLoginInIRISEnable() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (btnLoginInIRIS.isEnabled()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean ClickLogin() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (btnLoginInIRIS.isDisplayed()){
            Element.click(driver,btnLoginInIRIS);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean ClickLogout() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (btnLogout.isDisplayed()){
            Element.click(driver,btnLogout);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyHomepage() {
        boolean isVerified = false;
        Sync.Delay(7000);
        if (lblHomepage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyInvalidLoginMessage() {
        boolean isVerified = false;
        Sync.Delay(10000);
        if (invalidLoginMessage.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickPopupButton() {
        boolean isClicked = false;
        if (btnPopupButton.isDisplayed()){
            Element.click(driver,btnPopupButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyPrivacyPolicyLink() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (linkPrivacyPolicy.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickPrivacyPolicyLink() {
        boolean isClicked = false;
        if (linkPrivacyPolicy.isDisplayed()){
            Element.click(driver,linkPrivacyPolicy);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean navigateToNewTab() {
        boolean isDisplayed = false;
        Sync.Delay(5000);
        if (driver!=null) {
            tabs_windows = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs_windows.get(1));
            isDisplayed = true;
        }
        return isDisplayed;
    }

    public boolean verifyPrivacyPolicyTab() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (privacyPolicyTab.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean closeCurrentTab() {
        boolean isDisplayed = false;
        Sync.Delay(5000);
        if (driver!=null) {
            driver.close();
            driver.switchTo().window(tabs_windows.get(0));
            isDisplayed = true;
        }
        return isDisplayed;
    }

    public boolean verifyForgetPasswordLink() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (linkForgetPassword.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickForgetPasswordLink() {
        boolean isClicked = false;
        if (linkForgetPassword.isDisplayed()){
            Element.click(driver,linkForgetPassword);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterEmailAddress(String strUsername) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (txtBoxEmailAddress.isDisplayed()) {
            Textbox.enterValue(driver,txtBoxEmailAddress,strUsername);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickCancelButton() {
        boolean isClicked = false;
        if (btnCancel.isDisplayed()){
            Element.click(driver,btnCancel);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSendEmailButton() {
        boolean isClicked = false;
        if (btnSendEmail.isDisplayed()){
            Element.click(driver,btnSendEmail);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyEmailSent() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (messageSentVerification.isDisplayed()) {
            System.out.println("A password reset link has been sent to your Email");
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickOkButton() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (btnOk.isDisplayed()){
            Element.click(driver,btnOk);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyActiveAuditCount() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (activeAuditCount.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyTotalEmployeeCount() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (TotalEmployeeCount.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyTotalDependentCount() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (TotalDependentCount.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifySeperateComponentTab() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (listHeadingTab.size()!=0) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifytxtBoxSearch() {
        boolean isVerified = false;
        Sync.Delay(5000);
        if (txtBoxSearch.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean EnterConsovaid(String strUsername) {
        boolean isEntered = false;
        if (txtBoxSearch.isDisplayed()) {
            txtBoxSearch.clear();
            Textbox.enterValue(driver,txtBoxSearch,strUsername);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickFirstSuggestion() {
        boolean isClicked = false;
        Sync.Delay(25000);
        if (dropdownSuggestion.size()!=0) {
            Element.click(driver,dropdownSuggestion.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyFullNameInAccount() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (FullNameInAccount.isDisplayed()) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean allDetailsInAccount() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (sSNInAccount.isDisplayed()) {
            if (employeeIdInAccount.isDisplayed()) {
                if (dOBInAccount.isDisplayed()) {
                    if (genderInAccount.isDisplayed()) {
                        if (addressInAccount.isDisplayed()) {
                            if (homePhoneInAccount.isDisplayed()) {
                                if (mobilePhoneInAccount.isDisplayed()) {
                                    if (workPhoneInAccount.isDisplayed()) {
                                        if (emailInAccount.isDisplayed()) {
                                            if (preferredEmailInAccount.isDisplayed()) {
                                                isVerified=true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifyConsovaPINInAccount(String consovaID) {
        boolean isVerified = false;
        Sync.Delay(3000);
        if(lblConsovaPINInAccount.isDisplayed()) {
            if (consovaPINInAccount.get(0).getText().equals(consovaID)) {
                isVerified = true;
            }
        }
        return isVerified;
    }

    public boolean clickReportIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (reportIcon.isDisplayed()) {
            Element.click(driver,reportIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickStandardReportIcon() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (standardReportIcon.isDisplayed()) {
            Element.click(driver,standardReportIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickCustomReportIcon() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (customReportIcon.isDisplayed()) {
            Element.click(driver,customReportIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean filtersInStandardReportIcon() {
        boolean isVerified = false;
        Sync.Delay(30000);
        if (CompleteInStandardReport.isDisplayed()) {
            if (IncompleteInStandardReport.isDisplayed()) {
                if (InProcessInStandardReport.isDisplayed()) {
                    if (NonResponderInStandardReport.isDisplayed()) {
                        if (IneligibleInStandardReport.isDisplayed()) {
                            isVerified=true;
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean verifyCountInDropdown() {
        boolean isVerified = false;
        Sync.Delay(25000);
        if (dropdownSuggestion.size()==5) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyConsovaIdInDropdown(String consovaId) {
        boolean isVerified = false;
        Sync.Delay(30000);
        if (dropdownSuggestion.get(0).getText().contains(consovaId)) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyTextInMessagebox() {
        boolean isVerified = false;
        Sync.Delay(3000);
        if (noUserFoundVerification.isDisplayed()) {
            System.out.println("There is no user found having the provided email");
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickProfileIcon() {
        boolean isClicked = false;
        Sync.Delay(10000);
        if (profileIcon.isDisplayed()) {
            Element.click(driver,profileIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickBtnChangePassword() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (btnChangePassword.isDisplayed()) {
            Element.click(driver,btnChangePassword);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterCurrentPassword(String password) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (txtboxCurrentPassword.isDisplayed()) {
            Textbox.enterValue(driver,txtboxCurrentPassword,password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean EnterNewPassword(String password) {
        boolean isEntered = false;
        Sync.Delay(3000);
        if (txtboxNewPassword.isDisplayed()) {
            Textbox.enterValue(driver,txtboxNewPassword,password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean EnterConfirmPassword(String password) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (txtboxConfirmNewPassword.isDisplayed()) {
            Textbox.enterValue(driver,txtboxConfirmNewPassword,password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickBtnChangePasswordInPopup() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (btnChangePasswordInPopup.isDisplayed()) {
            Element.click(driver, btnChangePasswordInPopup);
            btnChangePasswordInPopup.sendKeys(Keys.TAB);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickBtnSavePasswordInPopup() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (btnSavePasswordInPopup.isDisplayed()) {
            Element.click(driver, btnSavePasswordInPopup);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean sleepForThreeMins() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (CompleteInStandardReport.isDisplayed()) {
            Sync.Delay(300000);
            Sync.waitForElements(driver,filterTxtboxInStandardReport);

            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterConsovaId(String strUsername) {
        boolean isEntered = false;
        if (filterTxtboxInStandardReport.size()!=0) {
            Textbox.enterValue(driver,filterTxtboxInStandardReport.get(6),strUsername);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickAccountLink() {
        boolean isEntered = false;
        Sync.Delay(7000);
        if (selectFirstEmployeeDisplayed.size()!=0) {
            Element.click(driver, selectFirstEmployeeDisplayed.get(0));
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyIndividualComponents() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (individualComponents.size()!=0) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean clickbtnAdminTicket() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (btnAdminTicket.isDisplayed()){
            Element.click(driver,btnAdminTicket);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickAdminTicketTypeDropdown() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (btnTicketReason.isDisplayed()){
            Element.click(driver,btnTicketReason);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyAdminTicketTypes() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (firstTicketReason.isDisplayed()) {
            if (secondTicketReason.isDisplayed()) {
                if (thirdTicketReason.isDisplayed()) {
                    if (fourthTicketReason.isDisplayed()) {
                        isVerified=true;
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean clickFirstAdminTicketTypeInDropdown() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (firstTicketReason.isDisplayed()){
            Element.click(driver,firstTicketReason);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSubmitButton() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (submitButton.isDisplayed()){
            Element.click(driver,submitButton);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterComments(String comments) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (TxtboxComments.isDisplayed()) {
            Textbox.enterValue(driver,TxtboxComments,comments);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean clickAuditsInAdminTicket() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (auditsInAdminTicket.isDisplayed()){
            Element.click(driver,auditsInAdminTicket);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickFirstAuditType() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (listAuditsInAdminTicket.size()!=0){
            Element.click(driver,listAuditsInAdminTicket.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSelectDependent() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (selectDependent.isDisplayed()){
            Element.click(driver,selectDependent);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSelectAllCheckBox() {
        boolean isClicked = false;
        Sync.Delay(3000);
        if (checkSelectAll.isDisplayed()){
            Element.click(driver,checkSelectAll);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickTicketHeader() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (ticketHeaderSort.size()!=0) {
            Element.click(driver,ticketHeaderSort.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickTicketNumber() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (ticketNumber.size()!=0) {
            Element.click(driver,ticketNumber.get(0));
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickSaveButton() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (btnSave.isDisplayed()) {
            Element.click(driver,btnSave);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean closeModal() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (closeModal.isDisplayed()) {
            Element.click(driver,closeModal);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickBtnLogout() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (LogoutInDropdown.isDisplayed()) {
            Element.click(driver,LogoutInDropdown);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean EnterCommentsInModal(String comments) {
        boolean isEntered = false;
        Sync.Delay(2000);
        if (commentsBox.isDisplayed()) {
            Textbox.enterValue(driver,commentsBox,comments);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean verifyTicketActions() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (btnAssignedToConsova.isDisplayed()) {
            if (btnAssignedToClient.isDisplayed()) {
                if (btnResolved.isDisplayed()) {
                    isVerified=true;
                }
            }
        }
        return isVerified;
    }

    public boolean verifyTicketNumberList() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (ticketNumber.size()!=0) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean verifyHeadersInAdminticket() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (headerConsovaPIN.size()!=0) {
            if (headerEmployeeName.size()!=0) {
                if (headerAuditDate.size()!=0) {
                    if (headerDependentName.size()!=0) {
                        if (headerLastComment.size()!=0) {
                            isVerified=true;
                        }
                    }
                }
            }
        }
        return isVerified;
    }

    public boolean clickViewTicketButton() {
        boolean isClicked = false;
        Sync.Delay(2000);
        if (btnViewTicket.isDisplayed()) {
            Element.click(driver,btnViewTicket);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean verifyAuditDependentsInSeperateTab() {
        boolean isVerified = false;
        Sync.Delay(2000);
        if (AuditDependentsInSeperateTab.size()!=0) {
            isVerified = true;
        }
        return isVerified;
    }

    public boolean outlookNavigation() {
        boolean isEntered = false;
        driver.get("https://login.microsoftonline.com/");
        isEntered = true;
        return isEntered;
    }

    public boolean office365username(String email) {
        boolean isEntered = false;
        if (usernameInOutlook.isDisplayed()) {
            Textbox.enterValue(driver, usernameInOutlook, email);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean office365password(String password) {
        boolean isEntered = false;
        Sync.Delay(5000);
        if (passwordInOutlook.isDisplayed()) {
            Textbox.enterValue(driver, passwordInOutlook, password);
            isEntered = true;
        }
        return isEntered;
    }

    public boolean nextButtonInOutlook() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (nextButtonInOutlook.isEnabled()) {
            Element.click(driver,nextButtonInOutlook);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean outlookIcon() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (outlookIcon.isEnabled()) {
            Element.click(driver,outlookIcon);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean loginButtonInOutlook() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (loginButtonInOutlook.isEnabled()) {
            Element.click(driver,loginButtonInOutlook);
            Element.click(driver,yesFromPopupInOutlook);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickActivationEmail() {
        boolean isClicked = false;
        Sync.Delay(30000);
        if (otersTabInOutlook.isDisplayed()) {
            //Element.click(driver,otersTabInOutlook);
            Element.click(driver,activationEmail);
            isClicked = true;
        }
        return isClicked;
    }

    public boolean clickActivationLink() {
        boolean isClicked = false;
        Sync.Delay(5000);
        if (activationLink.isEnabled()) {
            Element.click(driver,activationLink);
            isClicked = true;
        }
        return isClicked;
    }




}