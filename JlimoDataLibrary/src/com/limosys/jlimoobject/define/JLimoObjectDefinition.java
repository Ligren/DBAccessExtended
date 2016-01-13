package com.limosys.jlimoobject.define;

public enum JLimoObjectDefinition {

	Driver("fleet", "driver", "DriverDataAccessInfo"),
	DriverWapMsg("fleet", "driver", "DrvrWapMsgDataAccessInfo"),
	DriverWapAlert("fleet", "driver", "DriverWapAlertDataAccessInfo"),
	DriverBeeperLog("fleet", "driver", "DriverBeeperLogDataAccessInfo"),
	DriverAction("fleet", "driver", "DriverActionDataAccessInfo"),
	DriverActionType("fleet", "driver", "DriverActionTypeDataAccessInfo"),
	DriverClass("fleet", "driver", "DriverClassDataAccessInfo"),
	DriverStatus("fleet", "driver", "DriverStatusDataAccessInfo"),
	DriverWlPriority("fleet", "driver", "DriverWlPriorityDataAccessInfo"),
	DriverHomeAreaPriority("fleet", "driver", "DriverHomeAreaPriorityDataAccessInfo"),
	DriverHomeZone("fleet", "driver", "DriverHomeZoneDataAccessInfo"),
	NewDriverDefinition("fleet", "driver", "NewDriverDefinitionDataAccessInfo"),
	DriverSelect("fleet", "driver", "DriverSelectDataAccessInfo"),
	DriverBeeperMsgLkup("fleet", "driver", "DriverBeeperMsgLkupDataAccessInfo"),
	DriverBeeperMsg("fleet", "driver", "DriverBeeperMsgDataAccessInfo"),
	DriverNotifyType("fleet", "driver", "DriverNotifyTypeDataAccessInfo"),
	DriverNotify("fleet", "driver", "DriverNotifyDataAccessInfo"),
	DriverCountSetup("fleet", "driver", "DriverCountSetupDataAccessInfo"),
	DriverCountLog("fleet", "driver", "DriverCountLogDataAccessInfo"),
	DriverDistSetup("fleet", "driver", "DriverDistSetupDataAccessInfo"),
	DriverDistLog("fleet", "driver", "DriverDistLogDataAccessInfo"),
	DriverMsgLog("fleet", "driver", "DriverMsgLogDataAccessInfo"),
	DrvrPenalty("fleet", "driver", "DrvrPenaltyDataAccessInfo"),
	DrvrPenaltyType("fleet", "driver", "DrvrPenaltyTypeDataAccessInfo"),
	DrvrPenaltyTypeDetail("fleet", "driver", "DriverPenaltyTypeDetailDataAccessInfo"),
	DriverNotes("fleet", "driver", "DrvrNotesDataAccessInfo"),
	DriverReminder("fleet", "driver", "DriverReminderDataAccessInfo"),
	DriverCharge("fleet", "driver", "DriverChargeDataAccessInfo"),
	DriverChargeType("fleet", "driver", "DriverChargeTypeDataAccessInfo"),
	DriverDaysOff("fleet", "driver", "DriverDaysOffDataAccessInfo"),
	DriverExtraDays("fleet", "driver", "DriverExtraDaysDataAccessInfo"),
	DriverSchedule("fleet", "driver", "DriverScheduleDataAccessInfo"),
	DriverCheckGroup("fleet", "driver", "DriverCheckGroupDataAccessInfo"),
	DriverStartJobLog("fleet", "driver", "DriverStartJobLogDataAccessInfo"),
	DriverExpLkup("fleet", "driver", "DriverExpLkupDataAccessInfo"),
	DriverExpReminderLog("fleet", "driver", "DriverExpReminderLogDataAccessInfo"),
	DriverComm("fleet", "driver", "DriverCommDataAccessInfo"),
	DriverWeekHours("fleet", "driver", "DriverWeekHoursDataAccessInfo"),
	DriverPanicMsg("fleet", "driver", "DriverPanicMsgDataAccessInfo"),
	DriverJobArchInfo("fleet", "driver", "DriverJobArchInfoDataAccessInfo"),
	StartJob("fleet", "driver", "StartJobDataAccessInfo"),
	StartJobTimeBracket("fleet", "driver", "StartJobTimeBracketDataAccessInfo"),

	GPSLog("fleet^device", "driver", "GpsLogDataAccessInfo"),
	GpsId("fleet^device", "gps", "GpsIdDataAccessInfo"),
	GpsAffiliateBackup("fleet^device", "gpsaffbackup", "GpsAffBackupDataAccessInfo"),

	Car("fleet", "car", "CarDataAccessInfo"),
	CarStatus("fleet", "car", "CarStatusDataAccessInfo"),
	CarAllowedClass("fleet", "car", "CarAllowedClassDataAccessInfo"),
	CarType("fleet", "car", "CarTypeDataAccessInfo"),
	CarCapacity("fleet", "car", "CarCapacityDataAccessInfo"),
	CarClass("fleet", "car", "CarClassDataAccessInfo"),
	CarClassHier("fleet", "car", "CarClassHierDataAccessInfo"),
	CarAssignClass("fleet", "car", "CarAssignClassDataAccessInfo"),
	CarAssignLog("fleet", "car", "CarAssignLogDataAccessInfo"),
	CarImage("fleet", "car", "CarImageDataAccessInfo"),
	CarGroupLkup("fleet", "car", "CarGrpLkupDataAccessInfo"),
	CarClassGroup("fleet", "car", "CarClassGrpDataAccessInfo"),
	WorkingList("fleet", "car", "WorkingListDataAccessInfo"),
	WorkingListStatus("fleet", "car", "WorkingListStatusDataAccessInfo"),
	WaitingListLog("fleet", "car", "WaitingListLogDataAccessInfo"),
	WorkListHomeReq("fleet", "car", "WorkListHomeReqDataAccessInfo"),
	WorkListWlLimit("fleet", "car", "WorkListWlLimitDataAccessInfo"),
	WaitingListReason("fleet", "car", "WaitingListReasonDataAccessInfo"),
	CarLocation("fleet", "car", "CarLocationDataAccessInfo"),
	CarLeaseDaily("fleet", "car", "CarLeaseDailyDataAccessInfo"),
	CarLeaseDiscount("fleet", "car", "CarLeaseDiscountDataAccessInfo"),
	VhclMaint("fleet", "car", "VhclMaintDataAccessInfo"),
	VhclMaintDtl("fleet", "car", "VhclMaintDtlDataAccessInfo"),
	VhclMaintRepairShop("fleet", "car", "VhclMaintRepairShopDataAccessInfo"),
	VhclMaintType("fleet", "car", "VhclMaintTypeDataAccessInfo"),
	GasLog("fleet", "car", "GasLogDataAccessInfo"),
	GasStationLkup("fleet", "car", "GasStationLkupDataAccessInfo"),
	CarLink("fleet", "car", "CarLinkDataAccessInfo"),

	Franchise("fleet", "franchise", "FranchiseDataAccessInfo"),
	FranchiseCharge("fleet", "franchise", "FranChrgDataAccessInfo"),

	WlGuiZoneGroup("fleet", "car", "WlGuiZoneGroupDataAccessInfo"),
	WlGuiZoneGroupZones("fleet", "car", "WlGuiZoneGroupZonesDataAccessInfo"),
	WlGuiZoneGroupType("fleet", "car", "WlGuiZoneGrpTypeDataAccessInfo"),
	WlWapZone("fleet", "car", "WlWapZoneDataAccessInfo"),
	WlWapZoneByCar("fleet", "car", "WlWapZoneByCarDataAccessInfo"),
	WlLimit("fleet", "car", "WlLimitDataAccessInfo"),
	WlLimitDtl("fleet", "car", "WlLimitDtlDataAccessInfo"),
	WlDispZoneValidate("fleet", "car", "WlDispZoneValidateDataAccessInfo"),
	CarTlcLog("fleet", "car", "CarTlcLogDataAccessInfo"),

	Affiliate("fleet", "affiliate", "AffiliateDataAccessInfo"),
	AffiliateType("fleet", "affiliate", "AffiliateTypeDataAccessInfo"),
	AffiliateAirport("fleet", "affiliate", "AffiliateAirportDataAccessInfo"),
	AffiliateJob("fleet", "affiliate", "AffiliateJobDataAccessInfo"),
	AffiliateWebLog("fleet", "affiliate", "AffiliateWebLogDataAccessInfo"),
	AffiliateDsptchStatus("fleet", "affiliate", "AffiliateDsptchStatusDataAccessInfo"),
	AffiliateCarClass("fleet", "affiliate", "AffiliateCarClassDataAccessInfo"),
	AffiliateJobBid("fleet", "affiliate", "AffiliateJobBidDataAccessInfo"),
	AffiliateNotify("fleet", "affiliate", "AffiliateNotifyDataAccessInfo"),
	AffiliateCar("fleet", "affiliate", "AffCarDataAccessInfo"),
	AffiliateRpcInfo("fleet", "affiliate", "AffRpcInfoDataAccessInfo"),
	AffiliateCarList("fleet", "affiliate", "AffCarListDataAccessInfo"),
	AffiliateNotifyJob("fleet", "affiliate", "AffiliateNotifyJobDataAccessInfo"),
	AffiliateJobExposeRule("fleet", "affiliate", "AffiliateJobExposeRuleDataAccessInfo"),
	AffCarClass("fleet", "affiliate", "AffCarClassDataAccessInfo"),
	AffNetworkSetting("fleet", "affiliate", "AffNetworkSettingAccessInfo"),
	AffBlockedCar("fleet", "affiliate", "AffBlockedCarDataAccessInfo"),
	AffiliateNetworkCarClassLkup("fleet", "affiliate", "AffiliateNetworkCarClassLkupDataAccessInfo"),
	AffiliateJobAssign("fleet", "affiliate", "AffJobAssignDataAccessInfo"),
	BaseLic("fleet^affiliate", "base", "BaseLicDataAccessInfo"),
	BoroBaseReq("fleet^affiliate", "borobase", "BoroBaseReqDataAccessInfo"),

	Pop3Monitor("fleet", "affiliate", "Pop3MonitorDataAccessInfo"),
	MailboxMonitor("fleet", "affiliate", "MailboxMonitorDataAccessInfo"),

	MobileDevice("fleet^device", "lists", "MobileDeviceDataAccessInfo"),
	Radio("fleet^device", "lists", "RadioDataAccessInfo"),
	RadioQueue("fleet^device", "radioqueue", "RadioQueueDataAccessInfo"),
	MobileCarrier("fleet^device", "mobile", "MobileCarrierDataAccessInfo"),
	SwipeDeviceType("fleet^device", "swipedevice", "SwipeDeviceTypeDataAccessInfo"),
	MobileIcon("fleet^device", "mobile", "MobileIconDataAccessInfo"),
	MobileGoogleApiStat("fleet^device", "mobile", "MobileGoogleApiStatDataAccessInfo"),

	CarClassZoneDefault("carclass", "CarClassZoneDefaultDataAccessInfo"),
	CarClassMinFare("carclass", "CarClassMinFareDataAccessInfo"),
	CarClassMiscCharges("carclass", "CarClassMiscChrgDataAccessInfo"),

	Account("acct/cust", "acct", "AccountDataAccessInfo"),
	AccountPriority("acct/cust", "acct", "AccountPriorityDataAccessInfo"),
	AccountStatus("acct/cust", "acct", "AccountStatusDataAccessInfo"),
	AccountRestrict("acct/cust", "acct", "AccountRestrictDataAccessInfo"),
	AccountRestrictCarClass("acct/cust", "acct", "AccountRestrictCarClassDataAccessInfo"),
	AccountRestrictDriver("acct/cust", "acct", "AccountRestrictDriverDataAccessInfo"),
	AccountReqFlat("acct/cust", "acct", "AccountReqFlatDataAccessInfo"),
	AccountEmpl("acct/cust", "acct", "AccountEmplDataAccessInfo"),
	AccountDept("acct/cust", "acct", "AccountDeptDataAccessInfo"),
	AccountWebPaswrd("acct/cust", "acct", "AccountWebPaswrdDataAccessInfo"),
	AccountEmplUpdateMethodLkup("acct/cust", "acct", "AccountEmplUpdateMethodLkupDataAccessInfo"),
	AccountType("acct/cust", "acct", "AccountTypeDataAccessInfo"),
	AcctFare("acct/cust", "acct", "AcctFareDataAccessInfo"),
	AcctFareByAddr("acct/cust", "acct", "AcctFareByAddrDataAccessInfo"),
	AccountBth("acct/cust", "acct", "AccountBthDataAccessInfo"),
	AccountReqValidate("acct/cust", "acct", "AccountReqValidateDataAccessInfo"),
	AccountReqDownload("acct/cust", "acct", "AccountReqDownloadDataAccessInfo"),
	BillingGroup("acct/cust", "acct", "BillingGroupDataAccessInfo"),
	TelAcct("acct/cust", "acct", "TelAcctDataAccessInfo"),
	AccountCharge("acct/cust", "acct", "AccountChargeDataAccessInfo"),
	AccountChargeType("acct/cust", "acct", "AccountChargeTypeDataAccessInfo"),
	RateText("acct/cust", "acct", "RateTextDataAccessInfo"),

	Cust("acct/cust", "cust", "CustDataAccessInfo"),
	CustAddr("acct/cust", "cust", "CustAddrDataAccessInfo"),
	CustAcct("acct/cust", "cust", "CustAcctDataAccessInfo"),
	CustRestrict("acct/cust", "cust", "CustRestrictDataAccessInfo"),
	CustRestrictCarClass("acct/cust", "cust", "CustRestrictCarClassDataAccessInfo"),
	CustStatus("acct/cust", "cust", "CustStatusDataAccessInfo"),
	CustFop("acct/cust", "cust", "CustFopDataAccessInfo"),
	CustSearch("acct/cust", "cust", "CustSearchDataAccessInfo"),
	CustFare("acct/cust", "cust", "CustFareDataAccessInfo"),
	CustEmailVerify("acct/cust", "cust", "CustEmailVerifyDataAccessInfo"),
	CustFeedback("acct/cust", "cust", "CustFeedbackDataAccessInfo"),
	RestrictPhone("acct/cust", "cust", "RestrictPhoneDataAccessInfo"),
	WebUserPassenger("acct/cust", "cust", "WebUserPassengerDataAccessInfo"),
	CcCorpType("acct/cust", "cust", "CcCorpTypeCodeDataAccessInfo"),

	AcctAccessLevelBlng("acct/cust", "cust", "AcctAccessLevelBlngDataAccessInfo"),
	AcctAccessLevelRsv("acct/cust", "cust", "AcctAccessLevelRsvDataAccessInfo"),
	SalesPerson("acct/cust^person", "salesperson", "SalesPersonDataAccessInfo"),
	ContactPerson("acct/cust^person", "blngent", "ContactPersonDataAccessInfo"),

	Checkout("accounting", "checkout", "CheckoutDataAccessInfo"),
	CheckoutOpenDay("accounting", "checkout", "CheckoutOpenDayDataAccessInfo"),
	CheckoutShiftType("accounting", "checkout", "CheckoutShiftTypeDataAccessInfo"),

	AcctInvoice("accounting^acctInv", "invoice", "AcctInvoiceDataAccessInfo"),
	AcctInvCharge("accounting^acctInv", "invoice", "AcctInvChargeDataAccessInfo"),

	DrvrInvoice("accounting^drvrInv", "invoice", "DrvrInvoiceDataAccessInfo"),
	DrvrInvCharge("accounting^drvrInv", "invoice", "DrvrInvChargeDataAccessInfo"),
	DrvrInvYtd("accounting^drvrInv", "invoice", "DrvrInvYtdDataAccessInfo"),
	DrvrInvTemplate("accounting^drvrInv", "invoice", "DrvrInvTemplateDataAccessInfo"),
	DrvrInvCollect("accounting^drvrInv", "invoice", "DrvrInvCollectDataAccessInfo"),
	DrvrInvGroup("accounting^drvrInv", "invoice", "DrvrInvGroupDataAccessInfo"),

	FranInvoice("accounting^franInv", "invoice", "FranInvoiceDataAccessInfo"),
	
	SrvcInvoice("accounting^srvcInv", "srvcchrg", "SrvcInvoiceDataAccessInfo"),
	SrvcComp("accounting^srvcInv", "srvcchrg", "SrvcCompDataAccessInfo"),
	SrvcCompCc("accounting^srvcInv", "srvcchrg", "SrvcCompCcDataAccessInfo"),
	SrvcBlngPeriod("accounting^srvcInv", "srvcchrg", "SrvcBlngPeriodDataAccessInfo"),
	SrvcItem("accounting^srvcInv", "srvcchrg", "SrvcItemDataAccessInfo"),
	SrvcItemPrice("accounting^srvcInv", "srvcchrg", "SrvcItemPriceDataAccessInfo"),
	SrvcItemUseLog("accounting^srvcInv", "srvcchrg", "SrvcItemUseLogDataAccessInfo"),
	SrvcInvItem("accounting^srvcInv", "srvcchrg", "SrvcInvItemDataAccessInfo"),
	SrvcDeviceActivationLog("accounting^srvcInv", "srvcchrg", "SrvcDeviceActivationLogDataAccessInfo"),
	SrvcLicense("accounting^srvcInv", "srvcchrg", "SrvcLicenseDataAccessInfo"),

	BankAcct("accounting", "bank", "BankAcctDataAccessInfo"),
	BankCheck("accounting", "bank", "BankCheckDataAccessInfo"),

	Transactions("accounting^trans", "transactions", "TransactionsDataAccessInfo"),
	Trans("accounting^trans", "trans", "TransDataAccessInfo"),
	TransGrp("accounting^trans", "trans", "TransGrpDataAccessInfo"),
	AcctPmtBatch("accounting^trans", "payment", "AcctPmtBatchDataAccessInfo"),
	AcctPmt("accounting^trans", "payment", "AcctPmtDataAccessInfo"),
	AcctInvPmt("accounting^trans", "payment", "AcctInvPmtDataAccessInfo"),
	BillingEntityTotals("accounting^trans", "billingentitytotals", "BillingEntityTotalsDataAccessInfo"),
	Vendor("accounting^trans", "vendor", "VendorDataAccessInfo"),

	CcTranPcc("accounting^ccprocessing", "ccprocessing", "CcTranPccDataAccessInfo"),
	CcJob("accounting^ccprocessing", "ccprocessing", "CcJobDataAccessInfo"),
	CcBatch("accounting^ccprocessing", "ccprocessing", "CcBatchDataAccessInfo"),
	CcBatchJob("accounting^ccprocessing", "ccprocessing", "CcBatchJobDataAccessInfo"),
	CcBatchAcct("accounting^ccprocessing", "ccprocessing", "CcBatchAcctDataAccessInfo"),
	CcParameters("accounting^ccprocessing", "ccparameters", "CcParametersDataAccessInfo"),
	JobCharge("accounting^ccprocessing", "ccprocessing", "JobChargeDataAccessInfo"),
	JobCcTransTemp("accounting^ccprocessing", "ccprocessing", "JobCcTransTempDataAccessInfo"),
	BlngEntCcProc("accounting^ccprocessing", "ccprocessing", "BlngEntCcProcDataAccessInfo"),
	CcTokenReq("accounting^ccprocessing", "ccprocessing", "CcTokenReqDataAccessInfo"),
	CcFeeScale("accounting^ccprocessing", "ccprocessing", "CcFeeScaleDataAccessInfo"),

	CarmelClosing("accounting", "carmel", "CarmelClosingDataAccessInfo"),
	CarmelAddJob("accounting", "carmel", "CarmelAddJobDataAccessInfo"),

	DrvrCheck("accounting", "cashier", "DrvrCheckDataAccessInfo"),
	DrvrWorkDay("accounting", "cashier", "DrvrWorkDayDataAccessInfo"),
	DrvrEnvelope("accounting", "cashier", "DrvrEnvelopeDataAccessInfo"),
	PDXBatch("accounting", "pdxbatch", "PDXBatchDataAccessInfo"),
	PDXBatchJob("accounting", "pdxbatch", "PDXBatchJobDataAccessInfo"),

	ActiveDispZone("autodisp","ActiveDispZoneDataAccessInfo"),
	AutoDispWndw("autodisp", "AutoDispWndwDataAccessInfo"),
	AutoDispJobvalComponents("autodisp", "AutoDispJobvalComponentsDataAccessInfo"),
	AutoDispJobvalDestination("autodisp", "AutoDispJobvalDestinationDataAccessInfo"),
	AutoDispJobvalFop("autodisp", "AutoDispJobvalFopDataAccessInfo"),
	AutoDispJobvalZone("autodisp", "AutoDispJobvalZoneDataAccessInfo"),
	AutoDispJobvalCarClass("autodisp", "AutoDispJobvalCarClassDataAccessInfo"),
	AutoDispFareLimitDrvr("autodisp", "AutoDispFareLimitDrvrDataAccessInfo"),
	AutoDispFareLimitCar("autodisp", "AutoDispFareLimitCarDataAccessInfo"),
	AutoDispRefusedJobs("autodisp", "AutoDispRefusedJobsDataAccessInfo"),
	AutoDispPullZone("autodisp", "AutoDispPullZoneDataAccessInfo"),
	AutoBid("autodisp", "AutoBidDataAccessInfo"),
	EtaAdjustScale("autodisp", "EtaAdjustScaleDataAccessInfo"),

	Booked("booked", "BookedDataAccessInfo"),
	BookedDefaults("booked", "BookedDefaultsDataAccessInfo"),
	BookedCarGroup("booked", "BookedCarGroupDataAccessInfo"),
	BookedLog("booked", "BookedLogDataAccessInfo"),
	BookedAdjst("booked", "BookedAdjstDataAccessInfo"),
	BookedAdjstDefaults("booked", "BookedAdjstDefaultsDataAccessInfo"),
	BookedNextCar("booked", "BookedNextCarDataAccessInfo"),
	BookedBlock("booked", "BookedBlockDataAccessInfo"),
	BookedBlockZone("booked", "BookedBlockZoneDataAccessInfo"),
	BookedCarClassAcct("booked", "BookedCarClassAcctDataAcessInfo"),
	BookedFop("booked", "BookedFopDataAcessInfo"),

	Job("job", "JobDataAccessInfo"),
	JobStop("job", "JobStopDataAccessInfo"),
	JobStopsFlat("job", "JobStopsFlatDataAccessInfo"),
	JobReqrmnt("job", "JobReqrmntDataAccessInfo"),
	/** @todo get rid of this class */
	JobReqFlat("job", "JobReqFlatDataAccessInfo"),
	JobLink("job", "JobLinkDataAccessInfo"),
	JobLocked("job", "JobLockedDataAccessInfo"),
	JobLog("job", "JobLogDataAccessInfo"),
	JobStatus("job", "JobStatusDataAccessInfo"),
	JobEmail("job", "JobEmailDataAccessInfo"),
	JobFinal("job", "JobFinalDataAccessInfo"),
	JobNotepad("job", "JobNotepadDataAccessInfo"),
	JobGpsEta("job", "JobGpsEtaDataAccessInfo"),
	JobSchema("job", "JobSchemaAccessInfo"),
	JobSchemaFields("job", "JobSchemaFldsAccessInfo"),
	JobMiscChrg("job", "JobMiscChrgDataAccessInfo"),
	JobMiscChrgLkup("job", "JobMiscChrgLkupDataAccessInfo"),
	JobPsngr("job", "JobPsngrDataAccessInfo"),
	JobReqstdDrvr("job", "JobReqstdDrvrDataAccessInfo"),
	JobSteadyDaysOff("job", "JobSteadyDaysOffDataAccessInfo"),
	JobSteadyExtraDays("job", "JobSteadyExtraDaysDataAccessInfo"),
	JobSlsCommission("job", "JobSlsCommissionDataAccessInfo"),
	JobTwilioPhone("job", "JobTwilioPhoneDataAccessInfo"),
	SlsCommissionType("job", "SlsCommissionTypeDataAccessInfo"),
	JobChangeInfo("job", "JobChangeInfoDataAccessInfo"),
	JobGpsLog("job", "JobGpsLogDataAccessInfo"),
	JobToll("job", "JobTollDataAccessInfo"),
	JobBlngUpload("job", "JobBlngUploadDataAccessInfo"),

	CallerId("api", "callerid", "CallerIdDataAccessInfo"),
	CallMonitor("api", "callerid", "CallMonitorDataAccessInfo"),
	FarmOutJob("api", "farmout", "FarmOutJobDataAccessInfo"),
	FarmOutCommLog("api", "farmout", "FarmOutCommLogAccessInfo"),
	FlightCheck("api^flight", "lookup", "FlightCheckDataAccessInfo"),
	FlightView("api^flight", "flightview", "FlightViewDataAccessInfo"),
	FltbkJob("api", "fleetbook", "FltbkJobDataAccessInfo"),
	FltbkJobAddr("api", "fleetbook", "FltbkJobAddrDataAccessInfo"),
	FltbkJobCust("api", "fleetbook", "FltbkJobCustDataAccessInfo"),
	FltbkJobFare("api", "fleetbook", "FltbkJobFareDataAccessInfo"),

	AssignValCd("assign", "AssignValidationCdDataAccessInfo"),
	AssignValManual("assign", "AssignValManualDataAccessInfo"),
	AssignValNoShow("assign", "AssignValNoShowDataAccessInfo"),
	AssignValTripTypePass("assign", "AssignValTripTypePassDataAccessInfo"),
	AssignValidateSwitch("assign", "AssignValidateSwitchDataAccessInfo"),
	AssignValidateBTH("assign", "AssignValidateBTHDataAccessInfo"),
	AssignValFOP("assign", "AssignValFOPDataAccessInfo"),
	AssignValCapacity("assign", "AssignValCapacityDataAccessInfo"),
	AssignValBillingEntity("assign", "AssignValBillingEntityDataAccessInfo"),

	DispatchStatus("dispatch", "DispatchStatusDataAccessInfo"),
	DispatchFlag("dispatch", "DispatchFlagDataAccessInfo"),
	ResMsg("dispatch", "ResMsgDataAccessInfo"),
	ResMsgLog("dispatch", "ResMsgLogDataAccessInfo"),
	DriverLastJobLkup("dispatch", "DriverLastJobLkupDataAccessInfo"),
	DriverLastJobLog("dispatch", "DriverLastJobLogDataAccessInfo"),
	RestrictDispatchAssignTime("dispatch", "RestrictDispatchAssignTimeDataAccessInfo"),

	CustServComplaint("custservice", "CustsrvComplaintDataAccessInfo"),
	CustServReason("custservice", "CustsrvReasonDataAccessInfo"),
	CustServStatus("custservice", "CustsrvStatusDataAccessInfo"),
	AdvertiseLkup("custservice", "AdvertiseLkupDataAccessInfo"),

	OfficeMsg("messaging", "officemsg", "OfficeMsgDataAccessInfo"),
	OfficeMsgLkup("messaging", "officemsg", "OfficeMsgLkupDataAccessInfo"),
	OfficeMsgSendRole("messaging", "officemsg", "OfficeMsgSendRoleDataAccessInfo"),
	OfficeMsgType("messaging", "officemsg", "OfficeMsgTypeDataAccessInfo"),
	OfficeMsgTypeSub("messaging", "officemsg", "OfficeMsgTypeSubDataAccessInfo"),
	OfficeMsgAction("messaging", "officemsg", "OfficeMsgActionDataAccessInfo"),
	ScheduledMsg("messaging", "officemsg", "ScheduledMsgDataAccessInfo"),

	EmailLog("messaging^email", "gen", "EmailLogDataAccessInfo"),
	EmailTemplate("messaging^email", "email", "EmailTemplateDataAccessInfo"),
	EmailTemplateTypeLkup("messaging^email", "email", "EmailTemplateTypeDataAccessInfo"),
	PromoTemplate("messaging^email", "email", "PromoTemplateDataAccessInfo"),
	PromoEmailLog("messaging^email", "email", "PromoEmailLogDataAccessInfo"),

	SmsMsg("messaging^sms", "mobile", "SmsMsgDataAccessInfo"),
	CustSmsMsgLkup("messaging^sms", "mobile", "CustSmsMsgLkupDataAccessInfo"),
	SmsPromoOptOut("messaging^sms", "mobile", "SmsPromoOptOutDataAccessInfo"),

	UserEmp("users^empl", "accessrights", "UserEmpDataAccessInfo"),
	UserEmpCompOut("users^empl", "accessrights", "UserEmpCompOutDataAccessInfo"),
	FeatureAccs("users", "accessrights", "FeatureAccsDataAccessInfo"),
	StationRoleFeatureAccs("users", "accessrights", "StationRoleFeatureAccsDataAccessInfo"),
	Station("users", "accessrights", "StationDataAccessInfo"),
	StationRole("users", "accessrights", "StationRoleDataAccessInfo"),
	UserBreak("users", "timeclock", "UserBreakDataAccessInfo"),
	UserBreakType("users", "timeclock", "UserBreakTypeDataAccessInfo"),
	TimeCard("users", "timeclock", "TimeCardDataAccessInfo"),
	TimeCardType("users", "timeclock", "TimeCardTypeDataAccessInfo"),
	OperMistake("users", "opermistake", "OperMistakeDataAccessInfo"),
	OperMistakeTypeGrpLkup("users", "opermistake", "OperMistakeTypeGrpLkupDataAccessInfo"),
	OperMistakeTypeLkup("users", "opermistake", "OperMistakeTypeLkupDataAccessInfo"),
	OperMistakeCxlReason("users", "opermistake", "OperMistakeCxlReasonDataAccessInfo"),

	Ratebook("ratebook^gen", "ratebook", "RatebookDataAccessInfo"),
	RndingMethodLkup("ratebook^gen", "ratebook", "RndingMethodLkupDataAccessInfo"),
	PriceRounding("ratebook^gen", "ratebook", "PriceRoundingDataAccessInfo"),

	ListPriceGrpDetail("ratebook^listprice", "ratebook", "ListPriceGrpDetailDataAccessInfo"),
	ListPriceGroup("ratebook^listprice", "ratebook", "ListPriceGroupDataAccessInfo"),
	ListPriceAdj("ratebook^listprice", "ratebook", "ListPriceAdjDataAccessInfo"),
	ListPriceStop("ratebook^listprice", "ratebook", "ListPriceStopDataAccessInfo"),
	AltFareZone("ratebook^listprice", "ratebook", "AltFareZoneDataAccessInfo"),

	BasePrice("ratebook^baseprice", "ratebook", "BasePriceDataAccessInfo"),
	BasePriceLocAdjust("ratebook^baseprice", "ratebook", "BasePriceLocAdjustDataAccessInfo"),
	BasePricePassAdd("ratebook^baseprice", "ratebook", "BasePricePassAddDataAccessInfo"),
	BasePriceScale("ratebook^baseprice", "ratebook", "BasePriceScaleDataAccessInfo"),
	AltBaseParams("ratebook^baseprice", "ratebook", "AltBaseParamsDataAccessInfo"),
	BasePriceZoneTimeAdjust("ratebook^baseprice", "ratebook", "BasePriceZoneTimeAdjustDataAccessInfo"),
	BasePriceTimeDistance("ratebook^baseprice", "ratebook", "BasePriceTimeDistanceDataAccessInfo"),
	BasePriceTimeDistanceOverride("ratebook^baseprice", "ratebook", "BasePriceTimeDistanceOverrideDataAccessInfo"),
	BasePriceTimeDistanceDistOverride("ratebook^baseprice", "ratebook", "BasePriceTimeDistanceDistOverrideDataAccessInfo"),

	FreeWT("ratebook^bth/wt", "ratebook", "FreeWTDataAccessInfo"),
	BTHPrice("ratebook^bth/wt", "ratebook", "BTHPriceDataAccessInfo"),
	BTHOverride("ratebook^bth/wt", "ratebook", "BTHOverrideDataAccessInfo"),
	BthRates("ratebook^bth/wt", "ratebook", "BthRatesDataAccessInfo"),
	BthRatesTimeOverride("ratebook^bth/wt", "ratebook", "BthRatesTimeOvrrdDataAccessInfo"),
	FreeWaitingTime("ratebook^bth/wt", "jobcalc", "FreeWaitingTimeDataAccessInfo"),
	WtRates("ratebook^bth/wt", "ratebook", "WtRatesDataAccessInfo"),

	FareAdjust("ratebook^chrg", "ratebook", "FareAdjustDataAccessInfo"),
	FareAdjustScale("ratebook^chrg", "ratebook", "FareAdjustScaleDataAccessInfo"),
	AirportAdjustments("ratebook^chrg", "ratebook", "AirportAdjustmentsDataAccessInfo"),
	FuelChrgScale("ratebook^chrg", "ratebook", "FuelChrgScaleDataAccessInfo"),
	MiscChrgLkup("ratebook^chrg", "miscchrg", "MiscChrgLkupDataAccessInfo"),
	MiscChrgAmt("ratebook^chrg", "miscchrg", "MiscChrgAmtDataAccessInfo"),

	Toll("ratebook^toll", "ratebook", "TollDataAccessInfo"),
	TollCarClass("ratebook^toll", "ratebook", "TollCarClassDataAccessInfo"),
	TollGpsArea("ratebook^toll", "borobase", "TollGpsAreaDataAccessInfo"),
	PriceLineToll("ratebook^toll", "ratebook", "PriceLineTollDataAccessInfo"),
	TollZone("ratebook^toll", "ratebook", "TollZoneDataAccessInfo"),
	TollZoneAmt("ratebook^toll", "ratebook", "TollZoneAmtDataAccessInfo"),

	Zone("zoning^zone", "zoning", "ZoneDataAccessInfo"),
	Zoning("zoning^zone", "zoning", "ZoningDataAccessInfo"),
	AddrZone("zoning^addrzone", "zoning", "AddrZoneDataAccessInfo"),
	ZoneBoroTaxi("zoning^zone", "zoning", "ZoneBoroTaxiDataAccessInfo"),
	ClosedArea("zoning^addrzone", "addrzone", "ClosedAreaDataAccessInfo"),
	ClosedAreaDtl("zoning^addrzone", "addrzone", "ClosedAreaDtlDataAccessInfo"),
	LocalAreaZone("zoning^addrzone", "addrzone", "LocalAreaZoneDataAccessInfo"),
	GUIZoneGrid("zoning^grid", "zoning", "GUIZoneGridDataAccessInfo"),
	GUIZoneSetZones("zoning^grid", "zoning", "GUIZoneSetZonesDataAccessInfo"),
	AliasShape("zoning^link", "zoning", "AliasShapeDataAccessInfo"),
	MarketZoning("zoning^link", "zoning", "MarketZoningDataAccessInfo"),
	ZoneAddrRange("zoning^link", "zoning", "ZoneAddrRangeDataAccessInfo"),
	ZoneCenter("zoning^link", "zoning", "ZoneCenterDataAccessInfo"),
	ZoneTimeBtwnAdjust("zoning^time", "zoning", "ZoneTimeBtwnAdjustDataAccessInfo"),
	ZoneColor("zoning^color", "lookup", "ZoneColorLkupDataAccessInfo"),

	GEOAreas("geo^gen", "geo", "GEOAreasDataAccessInfo"),
	TripTypeLkup("geo^gen", "geo", "TripTypeLkupAccessInfo"),
	PUDOLocTypeLkup("geo^gen", "geo", "PUDOLocTypeLkupDataAccessInfo"),
	AreaLkup("geo^gen", "geo", "AreaLkupDataAccessInfo"),
	TaxArea("geo^gen", "tax", "TaxAreaDataAccessInfo"),

	Airport("geo^airport", "geo", "AirportDataAccessInfo"),
	Airline("geo^airport", "geo", "AirlineDataAccessInfo"),
	AirportPuLocation("geo^airport", "geo", "AirportPuLocationDataAccessInfo"),
	AirportPuTypeLkup("geo^airport", "geo", "AirportPuTypeLkupAccessInfo"),
	AirlineAirportTerminal("geo^airport", "geo", "AirlineAirportTerminalDataAccessInfo"),
	AirportTerminal("geo^airport", "geo", "AirportTerminalDataAccessInfo"),
	ApArrivalTypeLkup("geo^airport", "geo", "ApArrivalTypeLkupDataAccessInfo"),
	AirportParking("geo^airport", "geo", "AirportPrkngDataAccessInfo"),
	AirportAirlineProblem("geo^airport", "geo", "AirportAirlineProblemDataAccessInfo"),
	AirportDrvrSlctWndw("geo^airport", "geo", "AirportDrvrSlctWndwLkupDataAccessInfo"),

	Town("geo^town", "geo", "TownDataAccessInfo"),
	TownsZip("geo^town", "geo", "TownsZipDataAccessInfo"),
	TownZone("geo^town", "geo", "TownZoneDataAccessInfo"),
	State("geo^town", "geo", "StateDataAccessInfo"),
	Country("geo^town", "geo", "CountryDataAccessInfo"),
	CountryState("geo^town", "geo", "CountryStateDataAccessInfo"),
	IATACity("geo^town", "geo", "IATACityDataAccessInfo"),

	Hotel("geo^hotel", "hotel", "HotelDataAccessInfo"),
	HotelPhone("geo^hotel", "hotel", "HotelPhoneDataAccessInfo"),
	HotelAgent("geo^hotel", "hotel", "HotelAgentDataAccessInfo"),

	GeoAddr("geo^addr", "blngent", "GeoAddrDataAccessInfo"),
	LocalAddr("geo^addr", "geo", "LocalAddrDataAccessInfo"),
	Street("geo^addr", "geo", "StreetDataAccessInfo"),
	CrossStreet("geo^addr", "geo", "CrossStreetDataAccessInfo"),
	GeoAddress("geo^addr", "geo", "GeoAddressDataAccessInfo"),

	AddrTown("geo", "jlimoaddr", "AddrTownDataAccessInfo"),
	AddrStreet("geo", "jlimoaddr", "AddrStreetDataAccessInfo"),
	PostalAlias("geo", "jlimoaddr", "PostalAliasDataAccessInfo"),
	PostalStreet("geo", "jlimoaddr", "PostalStreetDataAccessInfo"),
	PostalZip("geo", "jlimoaddr", "PostalZipDataAccessInfo"),
	GoogleStreetOverride("geo", "jlimoaddr", "GoogleStreetOverrideDataAccessInfo"),

	Landmark("geo^landmark", "geo", "LandmarkDataAccessInfo"),
	LandmarkType("geo^landmark", "lookup", "LandmarkTypeDataAccessInfo"),

	GeoAliasZone("geo^alias", "geo", "GeoAliasZoneDataAccessInfo"),
	GeoAlias("geo^alias", "geo", "GeoAliasesDataAccessInfo"),

	Market("geo", "market", "MarketDataAccessInfo"),
	AirportMarket("geo", "market", "AirportMarketDataAccessInfo"),

	JLimoParameters("lists^gen", "gen", "JLimoParametersDataAccessInfo"),
	LogGenListComp("lists^gen", "gen", "LogGenListCompDataAccessInfo"),
	LogGenList("lists^gen", "gen", "LogGenListDataAccessInfo"),
	JLimoParamChngLog("lists^gen", "gen", "JLimoParamChngLogDataAccessInfo"),
	JLimoParamChngDtl("lists^gen", "gen", "JLimoParamChngDtlDataAccessInfo"),
	JLimoProcess("lists^gen", "jlimoprocess", "JLimoProcessDataAccessInfo"),
	AppMonitor("lists^gen", "maintenance", "AppMonitorDataAccessInfo"),
	JobMonitor("lists^gen", "lists", "JobMonitorDataAccessInfo"),

	CxlReason("lists", "lookup", "CxlReasonDataAccessInfo"),
	DayOfWeek("lists", "lookup", "DayOfWeekDataAccessInfo"),
	Fop("lists", "lookup", "FopDataAccessInfo"),
	JLimoAppOptions("lists", "lookup", "JLimoAppOptionsDataAccessInfo"),
	KoType("lists", "lookup", "KoTypeLkupDataAccessInfo"),
	LeaseType("lists", "lookup", "LeaseTypeDataAccessInfo"),
	ShiftType("lists", "lookup", "ShiftTypeLkupDataAccessInfo"),
	TrainSchedule("lists^lookup", "geo", "TrainScheduleDataAccessInfo"),
	InsuranceComp("lists^lookup", "lists", "InsuranceCompDataAccessInfo"),
	LngTranslator("lists", "lngtranslator", "LngTranslatorDataAccessInfo"),
	LngLkup("lists", "lngtranslator", "LngLkupDataAccessInfo"),

	Company("lists^company", "company", "CompanyDataAccessInfo"),
	CompanyDrvrPay("lists^company", "company", "CompanyDrvrPayDataAccessInfo"),
	CompAlias("lists^company", "company", "CompAliasDataAccessInfo"),
	DbCompParameter("lists^company", "company", "DbCompParameterDataAccessInfo"),
	CompanyCarClass("lists^company", "company", "CompanyCarClassDataAccessInfo"),
	PhoneLineCompany("lists^company", "phone", "PhoneLineCompanyDataAccessInfo"),

	TimeSlice("lists^timeslice", "utils", "TimeSliceDataAccessInfo"),
	TimeSliceDow("lists^timeslice", "utils", "TimeSliceDowDataAccessInfo"),
	TimeSliceExecuteLog("lists^timeslice", "utils", "TimeSliceExecuteLogDataAccessInfo"),
	TimeSliceLvlCntl("lists^timeslice", "ratebook", "TimeSliceLvlCntlDataAccessInfo"),
	TimeSliceLvl("lists^timeslice", "ratebook", "TimeSliceLvlDataAccessInfo"),

	Coupon("lists", "coupon", "CouponDataAccessInfo"),
	CouponCarClass("lists", "coupon", "CouponCarClassDataAccessInfo"),
	CouponCustServ("lists", "coupon", "CouponCustServDataAccessInfo"),

	FraudAlertCar("lists", "fraud", "FraudAlertCarDataAccessInfo"),
	FraudAddr("lists", "fraud", "FraudAddrDataAccessInfo"),
	FraudName("lists", "fraud", "FraudNameDataAccessInfo"),
	FraudTel("lists", "fraud", "FraudTelDataAccessInfo"),

	MobileAppProfile("mobileApp^", "mobile", "MobileAppProfileDataAccessInfo"),
	MobileBthTownLkup("mobileApp^", "mobile", "MobileBthTownLkupDataAccessInfo"),
	MobileCustComment("mobileApp^", "mobile", "MobileCustCommentDataAccessInfo"),
	MobileFeedback("mobileApp^", "mobile", "MobileFeedbackDataAccessInfo"),

	AlephJobMonitor("import/export", "aleph", "AlephJobMonitorDataAccessInfo"),
	PdoxJobRef("import/export", "export", "PdoxJobRefDataAccessInfo"),

	HelpMap("util", "helpmap", "HelpMapDataAccessInfo"),
	KeyLkup("util", "helpmap", "KeyLkupDataAccessInfo"),
	DatabaseBackupLog("util", "backup", "DbBackupLogAccessInfo"),
	GridSchema("util", "gridschema", "GridSchemaAccessInfo"),
	GridSchemaFlds("util", "gridschema", "GridSchemaFldsAccessInfo"),
	GridSchemaTypeLkup("util", "gridschema", "GridSchemaTypeLkupAccessInfo"),
	KeyActionMap("util", "keyaction", "KeyActionMapDataAccessInfo"),

	RptLkup("report", "RptLkupDataAccessInfo"),
	EmailRpt("report", "EmailRptDataAccessInfo"),
	EmailRptSched("report", "EmailRptSchedDataAccessInfo"),
	EmailRptSchedTypeLkup("report", "EmailRptSchedTypeLkupAccessInfo"),
	EmailRptLog("report", "EmailRptLogAccessInfo"),
	RptBookedView("report", "RptBookedViewDataAccessInfo"),
	RptBookedFactor("report", "RptBookedFactorDataAccessInfo"),
	RptWaitingListLog("report", "RptWaitingListLogDataAccessInfo"),
	RptWorkingDrvrsDist("report", "RptWorkingDriversDistDataAccessInfo"),
	RptDriverCountLog("report", "RptDriverCountLogDataAccessInfo"),

	DebugCar("MISC", "debug", "DebugCarDataAccessInfo"),
	JLimoErrorLog("MISC", "debug", "JLimoErrorLogDataAccessInfo"),
	MiscText("MISC", "misctext", "MiscTextDataAccessInfo"),
	PttRec("MISC", "ptt", "PttRecDataAccessInfo"),
	RpcUrlStore("MISC", "jsonrpc", "RpcUrlStoreDataAccessInfo"),
	LetterTemplate("letter", "LetterTemplateDataAccessInfo"),
	Doc("doc", "DocDataAccessInfo"),
	DocType("doc", "DocTypeDataAccessInfo"),
	T6467063785("vladtest", "T6467063785DataAccessInfo"),
	VladTestInd("vladtest", "VladTestIndDataAccessInfo"),
	VladDog("vladtest", "VladDogDataAccessInfo"),
	VladCat("vladtest", "VladCatDataAccessInfo");
	
	private String packageName = "com.limosys.jlimoobject.define";
	private String subpackageName = "";
	private String subMenu = "";
	private String dataAccessInfoClass;
	private String subMenuGroup = "";

	private JLimoObjectDefinition(String subpackageName, String dataAccessInfoClass) {
		this.subMenu = subpackageName;
		this.subpackageName = subpackageName;
		this.dataAccessInfoClass = dataAccessInfoClass;
	}

	private JLimoObjectDefinition(String subMenuGroup, String subpackageName, String dataAccessInfoClass) {
		String subMenu = subpackageName;
		int i = subMenuGroup.indexOf("^");
		if (i > 0) {
			if (i == subMenuGroup.length() - 1) {
				subMenu = subMenuGroup.substring(0, i);
				subMenuGroup = "";
			} else {
				subMenu = subMenuGroup.substring(i + 1);
				subMenuGroup = subMenuGroup.substring(0, i);
			}
		}

		this.subMenuGroup = subMenuGroup;
		this.subMenu = subMenu;
		this.subpackageName = subpackageName;
		this.dataAccessInfoClass = dataAccessInfoClass;
	}

	public JLimoObjectDataAccessInfo getObjectAccessInfo() {
		try {
			JLimoObjectDataAccessInfo objDAI = (JLimoObjectDataAccessInfo) Class.forName(packageName
																																										+ (subpackageName.equals("")
																																												? "" : "." + subpackageName)
																																										+ "." + dataAccessInfoClass)
																																					.newInstance();
			objDAI.setObjectDefinition(this);
			return objDAI;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public String getName() {
		return this.toString();
	}

	public String getSubMenuName() {
		return this.subMenu;
	}

	public String getSubMenuGroupName() {
		return this.subMenuGroup;
	}

}
