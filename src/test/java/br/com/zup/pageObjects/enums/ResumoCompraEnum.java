package br.com.zup.pageObjects.enums;

public enum ResumoCompraEnum {

	DESCRICAO(".cssSelector",
			"html body div#content div.ViewUI-sc-1ijittn-6.iXIDWU div.product-page__ViewUI-b5yzc3-0.gMBnqh.ViewUI-sc-1ijittn-6.iXIDWU div.GridUI-wcbvwm-0.idBPEj.ViewUI-sc-1ijittn-6.iXIDWU div.ColUI-gjy0oc-0.fOIaix.ViewUI-sc-1ijittn-6.iXIDWU section.product-main-area-b__CardProduct-sc-18529u5-3.dvQwUO.CardUI-sc-1eg6n71-0.jxqtmm div.GridUI-wcbvwm-0.gZNans.ViewUI-sc-1ijittn-6.iXIDWU div.product-main-area-b__ProductMainAreaUI-sc-18529u5-0.eFYfmy.ViewUI-sc-1ijittn-6.iXIDWU div.product-main-area-b__ProductBox-sc-18529u5-2.gvdckS.ViewUI-sc-1ijittn-6.iXIDWU div.product-main-area-b__ProductContainer-sc-18529u5-1.iQCcbi.ViewUI-sc-1ijittn-6.iXIDWU div.SpacingUI-pvph4q-0.gVrkwl.ViewUI-sc-1ijittn-6.iXIDWU div.TitleWrapper-sc-1wh9e1x-7.cOZQdh.ViewUI-sc-1ijittn-6.iXIDWU h1#product-name-default.product-title__TitleUi-sc-1r13at-0.jYPcAr.TitleH1-sc-1wh9e1x-0.kSKgXt"),
	PRECO(".cssSelector",
			"html body div#content div.ViewUI-sc-1ijittn-6.iXIDWU div.product-page__ViewUI-b5yzc3-0.gMBnqh.ViewUI-sc-1ijittn-6.iXIDWU div.GridUI-wcbvwm-0.idBPEj.ViewUI-sc-1ijittn-6.iXIDWU div.ColUI-gjy0oc-0.fOIaix.ViewUI-sc-1ijittn-6.iXIDWU section.product-main-area-b__CardProduct-sc-18529u5-3.dvQwUO.CardUI-sc-1eg6n71-0.jxqtmm div.GridUI-wcbvwm-0.gZNans.ViewUI-sc-1ijittn-6.iXIDWU div.product-main-area-b__ProductMainAreaUI-sc-18529u5-0.eFYfmy.ViewUI-sc-1ijittn-6.iXIDWU div.offer-box__Wrapper-sc-1hat60-0.dKwBwA.ViewUI-sc-1ijittn-6.iXIDWU div.offer-box__ContentWrapper-sc-1hat60-4.gWcnal.ViewUI-sc-1ijittn-6.iXIDWU div.buybox__BigSection-sc-4z0zqv-0.hmvxqX.ViewUI-sc-1ijittn-6.iXIDWU div.buybox__Section-sc-4z0zqv-1.dqwRJh.ViewUI-sc-1ijittn-6.iXIDWU div.main-offer__MainOfferView-sc-1c7pzd1-1.hKiULx.ViewUI-sc-1ijittn-6.iXIDWU div.main-offer__ContainerUI-sc-1c7pzd1-0.fjQzCD.ViewUI-sc-1ijittn-6.iXIDWU div.ViewUI-sc-1ijittn-6.iXIDWU div.price__ParagraphUI-ej7lo8-0.iAAPzD.ViewUI-sc-1ijittn-6.iXIDWU span.price__SalesPrice-ej7lo8-2.kjGSBk.TextUI-sc-12tokcy-0.bLZSPZ"),
	CEP(".id", "freight-field"),
	CEP_SELECIONADO(".cssSelector",".address__TextUI-sc-1a6a0ss-0"),
	CODIGO(".cssSelector", "tr.Tr-sc-1wy23hs-3:nth-child(1) > td:nth-child(2) > span:nth-child(1)"),
	CODIGO_BARRAS(".cssSelector", "tr.Tr-sc-1wy23hs-3:nth-child(2) > td:nth-child(2) > span:nth-child(1)"),
	MODELO(".cssSelector", "tr.Tr-sc-1wy23hs-3:nth-child(11) > td:nth-child(2) > span:nth-child(1)"),
	PESO(".cssSelector", "tr.Tr-sc-1wy23hs-3:nth-child(9) > td:nth-child(2) > span:nth-child(1)"),
	REFERENCIA(".cssSelector", "tr.Tr-sc-1wy23hs-3:nth-child(10) > td:nth-child(2) > span:nth-child(1)"),
	VALOR_FRENTE_ENVIO(".cssSelector",
			"div.freight-options__FreightOption-cesh2v-3:nth-child(1) > div:nth-child(2) > div:nth-child(1) > span:nth-child(2)");

	private String strProperty;
	private String strValue;

	private ResumoCompraEnum(String strProperty, String strValue) {
		this.strProperty = strProperty;
		this.strValue = strValue;
	}

	public String getStrProperty() {
		return strProperty;
	}

	public String getStrValue() {
		return strValue;
	}

}
