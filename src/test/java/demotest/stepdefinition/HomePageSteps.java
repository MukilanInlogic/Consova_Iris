package demotest.stepdefinition;

import commonpage.util.Testdata;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demotest.util.ActionContainer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class HomePageSteps {
    private ActionContainer actionContainer;

    public HomePageSteps(ActionContainer actionContainer) {
        this.actionContainer = actionContainer;
    }

    @And("^I Enter (.*) and (.*)$")
    public void iEnterUserNameAndPassword(String strUserName, String strPassword) {
        assertTrue(actionContainer.homePageActions.EnterUserName(Testdata.getValue(strUserName)));
        assertTrue(actionContainer.homePageActions.EnterPassword(Testdata.getValue(strPassword)));
    }

    @And("^I click Login button Consova$")
    public void iClickLoginButtonConsova() {
        assertTrue(actionContainer.homePageActions.ClickLogin());
    }

    @Given("^I should open the given (.*)$")
    public void iShouldOpenTheGivenUrl(String url) {
        assertTrue(actionContainer.homePageActions.enterURL(Testdata.getValue(url)));
    }

    @Then("^I should verify login page after navigating to url$")
    public void iShouldVerifyLoginPageAfterNavigatingToUrl() {
        assertTrue(actionContainer.homePageActions.verifyLoginpage());
    }

    @And("^I should verify disabled login button$")
    public void iShouldVerifyDisabledLoginButton() {
        assertTrue(actionContainer.homePageActions.btnLoginInIRISDisable());
    }

    @And("^I should verify enabled login button$")
    public void iShouldVerifyEnabledLoginButton() {
        assertTrue(actionContainer.homePageActions.btnLoginInIRISEnable());
    }

    @And("^I should verify the dashboard in homepage screen after successful login$")
    public void iShouldVerifyTheDashboardInHomepageScreenAfterSuccessfulLogin() {
        assertTrue(actionContainer.homePageActions.verifyHomepage());
    }

    @And("^I should logout of the application$")
    public void iShouldLogoutOfTheApplication() {
        assertTrue(actionContainer.homePageActions.ClickLogout());
    }

    @And("^I should I should verify the error popup message$")
    public void iShouldIShouldVerifyTheErrorPopupMessage() {
        assertTrue(actionContainer.homePageActions.verifyInvalidLoginMessage());
    }

    @And("^I should accept the error popup message$")
    public void iShouldAcceptTheErrorPopupMessage() {
        assertTrue(actionContainer.homePageActions.clickPopupButton());
    }

    @And("^I should verify the link to privacy policy$")
    public void iShouldVerifyTheLinkToPrivacyPolicy() {
        assertTrue(actionContainer.homePageActions.verifyPrivacyPolicyLink());
    }

    @And("^I should click the privacy policy link$")
    public void iShouldClickThePrivacyPolicyLink() {
        assertTrue(actionContainer.homePageActions.clickPrivacyPolicyLink());
    }

    @And("^I should navigate to newly opened tab$")
    public void iShouldNavigateToNewlyOpenedTab() {
        assertTrue(actionContainer.homePageActions.navigateToNewTab());
    }

    @And("^I should verify the privacy policy tab$")
    public void iShouldVerifyThePrivacyPolicyTab() {
        assertTrue(actionContainer.homePageActions.verifyPrivacyPolicyTab());
    }

    @And("^I should close the newly opened tab$")
    public void iShouldCloseTheNewlyOpenedTab() {
        assertTrue(actionContainer.homePageActions.closeCurrentTab());
    }

    @And("^I should verify the link to forget password$")
    public void iShouldVerifyTheLinkToForgetPassword() {
        assertTrue(actionContainer.homePageActions.verifyForgetPasswordLink());
    }

    @And("^I should click the forget password link$")
    public void iShouldClickTheForgetPasswordLink() {
        assertTrue(actionContainer.homePageActions.clickForgetPasswordLink());
    }

    @And("^I should enter the (.*) address in the reset password dialog box$")
    public void iShouldEnterTheEmailAddressInTheResetPasswordDialogBox(String strUserName) {
        assertTrue(actionContainer.homePageActions.EnterEmailAddress(Testdata.getValue(strUserName)));
    }

    @And("^I should click on Cancel button$")
    public void iShouldClickOnCancelButton() {
        assertTrue(actionContainer.homePageActions.clickCancelButton());
    }

    @And("^I should click on send password email from the popup$")
    public void iShouldClickOnSendPasswordEmailFromThePopup() {
        assertTrue(actionContainer.homePageActions.clickSendEmailButton());
    }

    @And("^I should verify the password reset sent notification$")
    public void iShouldVerifyThePasswordResetSentNotification() {
        assertTrue(actionContainer.homePageActions.verifyEmailSent());
    }

    @And("^I should click on OK button$")
    public void iShouldClickOnOKButton() {
        assertTrue(actionContainer.homePageActions.clickOkButton());
    }

    @And("^I should verify separate tabs each components$")
    public void iShouldVerifySeparateTabsEachComponents() {
        assertTrue(actionContainer.homePageActions.verifySeperateComponentTab());
    }

    @And("^I should verify active audit count with count$")
    public void iShouldVerifyActiveAuditCountWithCount() {
        assertTrue(actionContainer.homePageActions.verifyActiveAuditCount());
    }

    @And("^I should verify Total employee count across all components in active audits$")
    public void iShouldVerifyTotalEmployeeCountAcrossAllComponentsInActiveAudits() {
        assertTrue(actionContainer.homePageActions.verifyTotalEmployeeCount());
    }

    @And("^I should verify Total dependent count across all components in active audits$")
    public void iShouldVerifyTotalDependentCountAcrossAllComponentsInActiveAudits() {
        assertTrue(actionContainer.homePageActions.verifyTotalDependentCount());
    }

    @And("^I should verify the search bar$")
    public void iShouldVerifyTheSearchBar() {
        assertTrue(actionContainer.homePageActions.verifytxtBoxSearch());
    }

    @And("^I should enter consovaid (.*) in search bar$")
    public void iShouldEnterConsovaidInSearchBar(String consovaid) {
        assertTrue(actionContainer.homePageActions.EnterConsovaid(Testdata.getValue(consovaid)));
    }

    @And("^I should select the first suggestion in filtered list$")
    public void iShouldSelectTheFirstSuggestionInFilteredList() {
        assertTrue(actionContainer.homePageActions.clickFirstSuggestion());
    }

    @And("^I should verify the opened account with enetered (.*)$")
    public void iShouldVerifyTheOpenedAccountWithEneteredConsovaid(String consovaID) {
        assertTrue(actionContainer.homePageActions.verifyConsovaPINInAccount(Testdata.getValue(consovaID)));
    }

    @And("^I should verify full name in account screen$")
    public void iShouldVerifyFullNameInAccountScreen() {
        assertTrue(actionContainer.homePageActions.verifyFullNameInAccount());
    }

    @And("^I should verify SSN, clientID, DOB, address, city, state, zipcode, homephone, workphone, email and preferred email$")
    public void iShouldVerifySSNClientIDDOBAddressCityStateZipcodeHomephoneWorkphoneEmailAndPreferredEmail() {
        assertTrue(actionContainer.homePageActions.allDetailsInAccount());
    }

    @And("^I should verify the dropdown list populated with five suggestions$")
    public void iShouldVerifyTheDropdownListPopulatedWithFiveSuggestions() {
        //assertTrue(actionContainer.homePageActions.verifyCountInDropdown());
    }

    @And("^I should verify the (.*) present in the populated dropdown$")
    public void iShouldVerifyTheConsovaidPresentInThePopulatedDropdown(String consovaId) {
        assertTrue(actionContainer.homePageActions.verifyConsovaIdInDropdown(Testdata.getValue(consovaId)));
    }

    @And("^I should click the reports icon in menubar$")
    public void iShouldClickTheReportsIconInMenubar() {
        assertTrue(actionContainer.homePageActions.clickReportIcon());
    }

    @And("^I should verify icons present in the screen$")
    public void iShouldVerifyIconsPresentInTheScreen() {
        assertTrue(actionContainer.homePageActions.filtersInStandardReportIcon());
    }

    @And("^I should click on Standard report from dropdown$")
    public void iShouldClickOnStandardReportFromDropdown() {
        assertTrue(actionContainer.homePageActions.clickStandardReportIcon());
    }

    @And("^I should verify the error message in popup dialog box$")
    public void iShouldVerifyTheErrorMessageInPopupDialogBox() {
        assertTrue(actionContainer.homePageActions.verifyTextInMessagebox());
    }

    @And("^I should click on profile icon in menubar$")
    public void iShouldClickOnProfileIconInMenubar() {
        assertTrue(actionContainer.homePageActions.clickProfileIcon());
    }

    @And("^I should click on change password in dropdown$")
    public void iShouldClickOnChangePasswordInDropdown() {
        assertTrue(actionContainer.homePageActions.clickBtnChangePassword());
    }

    @And("^I should enter the (.*) in current password textbox$")
    public void iShouldEnterThePasswordInCurrentPasswordTextbox(String password) {
        assertTrue(actionContainer.homePageActions.EnterCurrentPassword(Testdata.getValue(password)));
    }

    @And("^I should enter the (.*) in new password textbox$")
    public void iShouldEnterThePasswordInNewPasswordTextbox(String password) {
        assertTrue(actionContainer.homePageActions.EnterNewPassword(Testdata.getValue(password)));
    }

    @And("^I should enter the (.*) in new confirm password textbox$")
    public void iShouldEnterThePasswordInNewConfirmPasswordTextbox(String password) {
        assertTrue(actionContainer.homePageActions.EnterConfirmPassword(Testdata.getValue(password)));
    }

    @And("^I should click on change password in popup$")
    public void iShouldClickOnChangePasswordInPopup() {
        assertTrue(actionContainer.homePageActions.clickBtnChangePasswordInPopup());
    }

    @And("^I should wait for three minutes to get the report page loaded$")
    public void iShouldWaitForThreeMinutesToGetTheReportPageLoaded() {
        assertTrue(actionContainer.homePageActions.sleepForThreeMins());
    }

    @And("^I should enter the (.*) in consova id filter box$")
    public void iShouldEnterTheConsovaidInConsovaIdFilterBox(String concovaID) {
        assertTrue(actionContainer.homePageActions.EnterConsovaId(Testdata.getValue(concovaID)));
    }

    @And("^I should select the respective consovaid$")
    public void iShouldSelectTheRespectiveConsovaid() {
        assertTrue(actionContainer.homePageActions.clickAccountLink());
    }

    @And("^I should verify individual tabs for dependents and components$")
    public void iShouldVerifyIndividualTabsForDependentsAndComponents() {
        assertTrue(actionContainer.homePageActions.verifyIndividualComponents());
    }

    @And("^I should click on Admin ticket button$")
    public void iShouldClickOnAdminTicketButton() {
        assertTrue(actionContainer.homePageActions.clickbtnAdminTicket());
    }

    @And("^I should click on ticket type dropdown$")
    public void iShouldClickOnTicketTypeDropdown() {
        assertTrue(actionContainer.homePageActions.clickAdminTicketTypeDropdown());
    }

    @And("^I should select type from list displayed from dropdown$")
    public void iShouldSelectTypeFromListDisplayedFromDropdown() {
        assertTrue(actionContainer.homePageActions.clickFirstAdminTicketTypeInDropdown());
    }

    @And("^I should write (.*) in the comments box$")
    public void iShouldWriteCommentsInTheCommentsBox(String comments) {
        assertTrue(actionContainer.homePageActions.EnterComments(Testdata.getValue(comments)));
    }

    @And("^I should click on Submit button$")
    public void iShouldClickOnSubmitButton() {
        assertTrue(actionContainer.homePageActions.clickSubmitButton());
    }

    @And("^I should verify admin ticket types from dropdown$")
    public void iShouldVerifyAdminTicketTypesFromDropdown() {
        assertTrue(actionContainer.homePageActions.verifyAdminTicketTypes());
    }

    @And("^I should click on audit type dropdown$")
    public void iShouldClickOnAuditTypeDropdown() {
        assertTrue(actionContainer.homePageActions.clickAuditsInAdminTicket());
    }

    @And("^I should select audit type from dropdown$")
    public void iShouldSelectAuditTypeFromDropdown() {
        assertTrue(actionContainer.homePageActions.clickFirstAuditType());
    }

    @And("^I should click on dependents dropdown$")
    public void iShouldClickOnDependentsDropdown() {
        assertTrue(actionContainer.homePageActions.clickSelectDependent());
    }

    @And("^I should select all from list displayed from dropdown$")
    public void iShouldSelectAllFromListDisplayedFromDropdown() {
        assertTrue(actionContainer.homePageActions.clickSelectAllCheckBox());
    }

    @And("^I should click on ticket header to arrange ticket numbers in descending order$")
    public void iShouldClickOnTicketHeaderToArrangeTicketNumbersInDescendingOrder() {
        assertTrue(actionContainer.homePageActions.clickTicketHeader());
    }

    @And("^I should click on last created admin ticket number link$")
    public void iShouldClickOnLastCreatedAdminTicketNumberLink() {
        assertTrue(actionContainer.homePageActions.clickTicketNumber());
    }

    @And("^I should enter (.*) in modal comment box$")
    public void iShouldEnterCommentsInModalCommentBox(String comments) {
        assertTrue(actionContainer.homePageActions.EnterCommentsInModal(Testdata.getValue(comments)));
    }

    @And("^I should click on Save button$")
    public void iShouldClickOnSaveButton() {
        assertTrue(actionContainer.homePageActions.clickSaveButton());
    }

    @And("^I should close the modal$")
    public void iShouldCloseTheModal() {
        assertTrue(actionContainer.homePageActions.closeModal());
    }

    @And("^I should click on log out from dropdown$")
    public void iShouldClickOnLogOutFromDropdown() {
        assertTrue(actionContainer.homePageActions.clickBtnLogout());
    }

    @And("^I should verify different actions for admin ticket$")
    public void iShouldVerifyDifferentActionsForAdminTicket() {
        assertTrue(actionContainer.homePageActions.verifyTicketActions());
    }

    @And("^I should verify headers in the admin ticket dialog box$")
    public void iShouldVerifyHeadersInTheAdminTicketDialogBox() {
        assertTrue(actionContainer.homePageActions.verifyHeadersInAdminticket());
    }

    @And("^I should verify admin tickets link individually$")
    public void iShouldVerifyAdminTicketsLinkIndividually() {
        assertTrue(actionContainer.homePageActions.verifyTicketNumberList());
    }

    @And("^I should click on view ticket to open created ticket$")
    public void iShouldClickOnViewTicketToOpenCreatedTicket() {
        assertTrue(actionContainer.homePageActions.clickViewTicketButton());
    }

    @And("^I should see each dependent in a separate tab$")
    public void iShouldSeeEachDependentInASeparateTab() {
        assertTrue(actionContainer.homePageActions.verifyAuditDependentsInSeperateTab());
    }

    @Given("^I should navigate to web outlook$")
    public void iShouldNavigateToWebOutlook() {
        assertTrue(actionContainer.homePageActions.outlookNavigation());
    }

    @And("^I should login to outlook by clicking login button$")
    public void iShouldLoginToOutlookByClickingLoginButton() {
        assertTrue(actionContainer.homePageActions.loginButtonInOutlook());
    }

    @And("^I should click on activation email$")
    public void iShouldClickOnActivationEmail() {
        assertTrue(actionContainer.homePageActions.clickActivationEmail());
    }

    @And("^I should click on activation link$")
    public void iShouldClickOnActivationLink() {
        assertTrue(actionContainer.homePageActions.clickActivationLink());
    }

    @And("^I should click on Next button$")
    public void iShouldClickOnNextButton() {
        assertTrue(actionContainer.homePageActions.nextButtonInOutlook());
    }

    @And("^I should enter username as (.*)$")
    public void iShouldEnterUsernameAsEmail(String email) {
        assertTrue(actionContainer.homePageActions.office365username(Testdata.getValue(email)));
    }

    @And("^I should give password as (.*)$")
    public void iShouldGivePasswordAsPassword(String password) {
        assertTrue(actionContainer.homePageActions.office365password(Testdata.getValue(password)));
    }

    @And("^I should click on outlook icon from menubar$")
    public void iShouldClickOnOutlookIconFromMenubar() {
        assertTrue(actionContainer.homePageActions.outlookIcon());
    }

    @And("^I should click on save password in popup$")
    public void iShouldClickOnSavePasswordInPopup() {
        assertTrue(actionContainer.homePageActions.clickBtnSavePasswordInPopup());
    }
}