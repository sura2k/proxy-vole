package com.github.markusbernhardt.proxy.search.browser.ie;

/*****************************************************************************
 * Proxy settings container used for the native methods. Will contain the
 * Internet Explorer proxy settings as reported by windows WinHTTP API.
 * 
 * @author Markus Bernhardt, Copyright 2016
 * @author Bernd Rosstauscher, Copyright 2009
 ****************************************************************************/

public class IEProxyConfig {

	private boolean autoDetect;
	private String autoConfigUrl;
	private String proxy;
	private String proxyBypass;

	/*************************************************************************
	 * Constructor
	 * 
	 * @param autoDetect
	 *            flag is autodetect is active or not.
	 * @param autoConfigUrl
	 *            the URL for a PAC script
	 * @param proxy
	 *            the proxy server selected
	 * @param proxyBypass
	 *            the proxy bypass address list.
	 ************************************************************************/

	public IEProxyConfig(boolean autoDetect, String autoConfigUrl, String proxy, String proxyBypass) {
		super();
		this.autoDetect = autoDetect;
		this.autoConfigUrl = autoConfigUrl;
		this.proxy = proxy;
		this.proxyBypass = proxyBypass;
	}

	/*************************************************************************
	 * @return Returns the autoDetect.
	 ************************************************************************/

	public boolean isAutoDetect() {
		return this.autoDetect;
	}

	/*************************************************************************
	 * @return Returns the autoConfigUrl.
	 ************************************************************************/

	public String getAutoConfigUrl() {
		return this.autoConfigUrl;
	}

	/*************************************************************************
	 * @return Returns the proxy.
	 ************************************************************************/

	public String getProxy() {
		return this.proxy;
	}

	/*************************************************************************
	 * @return Returns the proxyBypass.
	 ************************************************************************/

	public String getProxyBypass() {
		return this.proxyBypass;
	}

}
