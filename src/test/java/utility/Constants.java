package utility;

public class Constants extends TestBase {
	
	// Paths
	public static final String LOG4JDIR = "C:/Jenkins/workspace/SFDC/AT-SFDC-Current Sprint/SFDC_Cucumber/src/test/resources/log4j.properties";

	// Jenkins Configuration to generate Test Results of textfile format
	// public static final String TESTDATARESULTSDIR = "C:/Jenkins/workspace/SFDC/AT-SFDC-Current Sprint/SFDC_Cucumber/target/RunTimeDataLogs/TestDataResults.txt";
	
	// Jenkins Configuration to generate Test Results of textfile formate	public static final String TESTDATARESULTSDIR = "C:/Jenkins/workspace/SFDC/AT-SFDC-Current Sprint/SFDC_Cucumber/target/RunTimeDataLogs/TestDataResults.txt";
	public static final String TESTDATARESULTSDIR = "./target/RunTimeDataLogs/TestDataResults.txt";
	
	// Reporting Loggers
	public static final String IMAGE = "image/png";
	public static final String RUNNINGBUINFO = "Running the Bussiness unit as : ";
	public static final String LOG_FILENOTFOUND = "File not Found Exception :: ";
	public static final String LOG_WRITEOPERFAILED = "Unable to perform write Operation";
	public static final String TESTDATAFILENOTFOUND= "Testdata File not found for : ";
	
	
	// Element Loggers
	public static final String LOG_NOSUCHELEMENTFOUND = "No Such Element Found Exception Error Occured: ";
	public static final String LOG_UNEXPECTEDERROROCCURED = "Unable to find Expected Element in DOM : ";
		
	// BU Units
	public static final String BUAVIATION = "Aviation";
	public static final String BUMARITIME = "Maritime";
	public static final String BUENTERPRISE = "Enterprise";
	public static final String BUG2 = "G2";
	public static final String BUUSG = "USG";
	
	// Modules 
	public static final String CAMPAIGNMODULE = "Campaign";
	public static final String ACCOUNTSMODULE = "Accounts";
	public static final String CONTACTMODULE = "Contacts";
	public static final String DEMO_REQUESTMODULE = "Demo Requests";
	public static final String LEADMODULE = "Leads";
	public static final String ASSOCIATECAMPIGNWITHLEAD = "Associate Campaign with Lead";
	public static final String CONVERTTHELEAD = "Convert the Lead";
	public static final String OPPORTUNITYMODULE = "Opportunity";
	public static final String CASESMODULE = "Cases";
	public static final String BUAPPROVALMODULE = "BU Approval";
	public static final String BUOPPORTUNITYCASENUMBER = "Case Number";
	public static final String CREDITLIMITREQUEST = "Credit Limit Request";
	public static final String OPPORTUNITYQUICKLINKMODULE = "OpportunityQuickLink";
	public static final String CONTRACTREQUESTMODULE = "Contract Request";
	public static final String LEASEREQUESTSMODULE = "Lead Requests";
	
	// Common TestData Column Names from Excel sheet
	public static final String CAMPAIGNNAME = "CampaignName";
	public static final String EMAIL = "Email";
	public static final String LASTNAME = "LastName";
	public static final String COMPANYNAME = "CompanyName";
	public static final String ACCOUNTNAME = "AccountName";
	public static final String REGION = "Region";
	public static final String REGIONAVIATION = "RegionAviation";
	public static final String REGIONMARITIME = "RegionMaritime";
	public static final String REGIONUSG = "RegionUSG";
	public static final String PRODUCTSERVICEINTEREST = "Product/ServiceInterest";
	public static final String STREET = "Street";
	public static final String CITY = "City";
	public static final String STATE = "State";
	public static final String ZIPCODE = "Zip/Postalcode";
	public static final String COUNTRY = "Country";
	public static final String OPPORTUNITYNAME = "OpportunityName";
	public static final String TYPEOFCONTRACT = "TypeOfContract";
	public static final String CURRENCY = "Currency";
	public static final String COMMISSIONS = "Commissions";
	public static final String GROUPNAME = "GroupName";
	
	// Expected Web page titles
	public static final String EXPECTEDACCOUNTSPAGETITLE = "Recently Viewed | Accounts | Salesforce";
	public static final String EXPECTEDCAMPAIGNSPAGETITLE = "Recently Viewed | Campaigns | Salesforce";
	public static final String EXPECTEDCONTACTSPAGETITLE = "Recently Viewed | Contacts | Salesforce";
	public static final String EXPECTEDOPPORTUNITYPAGETITLE = "Recently Viewed | Opportunities | Salesforce";
	
	// Pop up titles
	public static final String NEWLEADTITLE = "New Lead";
	public static final String NEWLEADTITLEINMARSAT = "New Lead: Inmarsat Leads";
	public static final String NEWUSGLEADTITLE = "New Lead: USG Quotes";
	public static final String SELECTSTAGETITLE = "Edit Dependencies";
	public static final String BUAPPROVALTITLE = "BU Approval";
	public static final String APPROVEOPPORTUNITY = "Approve Opportunity";
	public static final String CONTRACTREQUEST = "Contract Request";
	public static final String CONTRACTREQUESTNEWCUSTOMER = "New Contract Request: New Customer";
	public static final String CONTRACTMODIFICATIONREQUEST = "Contract Modification Request";
	public static final String CONTRACTMODIFICATIONREQUESTNEWCUSTOMER = "New Contract Request: Contract Modification";
	public static final String EDITLEAD = "Edit Lead";
	public static final String DELETELEAD = "Delete Lead";
	public static final String INDICATIVECREDITGUIDANCE = "Indicative Credit Guidance";
	public static final String NDA = "NDA";
	public static final String NEWLEASEREQUESTTITLE = "New Leasing Request";
	public static final String EDIT = "Edit ";
	public static final String DELETELEASEREQUEST = "Delete Leasing Request";
	public static final String NEWNETWORKSOLUTIONSREQUESTTITLE = "New Network Solutions Request:";
	public static final String DELETENETWORKSOLUTIONSREQUEST = "Delete ";
	
	// Opportunity TestData
	public static final String CAMPAIGN = "Campaign";
	public static final String OPPORTUNITYRENEWALNAME = "OpportunityRenewalName";
	public static final String SALESTEAM = "SalesTeam";
	public static final String SALESREGION = "SalesRegion";
	public static final String TECHNOLOGY = "Technology";
	public static final String VERTICALMARKET = "Vertical Market";
	public static final String PRICEBOOK = "PriceBook";
	public static final String PRODUCT = "Product";
	public static final String QUANTITY = "Quantity";
	public static final String CONTRACTTERMS = "ContractTerms";
	public static final String AUTOCREATEFUTUREOPPORTUNITY = "AutoCreateFutureOpportunity";
	public static final String REASSIGNOWNER = "ReassignOwner";
	public static final String BUAPPROVALREQIRED = "BUApprovalRequired";
	public static final String STEP1APPROVER = "Step1Approver";
	public static final String STEP2APPROVER = "Step2Approver";
	public static final String DRPENDUSER = "End User";

	// Notes
	public static final String NOTETITLE = "Entered a Title";
	public static final String NOTEDESCRIPTION = "Entered the description";
	
	// Contract Requests Page
	public static final String CORPORATEREGISTRATIONNUMBER = "123456";
	public static final String PRICINGAGREEMENTNUMBER = "123456";
	public static final String OVERALLMONTHLYREVENUEFORECAST = "123456";
	public static final String ENTERPRISEBU = "Enterprise";

	// BU Approval Page
	public static final String SINGLEAPPROVER = "Single";
	public static final String MULTIAPPROVER = "Multi";
	
	// Lease Request Page
	public static final String LEASECUSTOMERNAME = "LeaseCustomer";
	public static final String ACCOUNTNUMBER = "123456789";	
	
	// Network Solution Requests Page
	public static final String BILLINGPROFILECODE = "Code123";
	public static final String DASHBOARDCUSTID = "123456789";
	public static final String EDIT_DASHBOARDCUSTID = "987654321";
	
	// Direct Texts
	public static final String TXTYES = "Yes";
	public static final String TXTNO = "No";
	public static final String TXTHOME = "Home";
	public static final String TXTACCOUNT = "ACCOUNT";
	public static final String TXTCONTACT = "CONTACT";
	public static final String TXTOPPORTUNITY = "OPPORTUNITY";
	public static final String TXTLEADS = "Leads";
	public static final String TXTLEASEREQUESTS = "Leasing Requests";
	public static final String TXTNETWORKSOLUTIONSREQUESTS = "Network Solutions Requests";
	public static final String TXTCONVERTLEAD = "Convert Lead";
	public static final String TXTOPPORTUNITYQRN = "QRN";
	public static final String TXTOPPORTUNITYNAME = "OpportunityName";
	public static final String TXTCPP = "CPP";
	public static final String NULL = "";

	//Success messages
	public static final String LEADCONVERTEDSUCCESSFULLY = "Your lead has been converted";
}
