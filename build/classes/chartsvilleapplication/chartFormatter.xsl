<?xml version="1.0" encoding="UTF-8"?>
<!--
    Document   : chartFormatter.xsl
    Created on : September 23, 2014, 5:26 PM
    Author     : DIZ07
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:fn="http://www.w3.org/2005/xpath-functions">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" type="text/css" href="chartFormatter.css"></link>
                <title><xsl:value-of select="MusicChart/ChartHeader/ChartName"/></title>
            </head>
            <body>
                <table border="0">
                    <thead>
                        <tr>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td style="font-family:sans-serif; font-size: xx-large"><xsl:value-of select="MusicChart/ChartHeader/ChartName"/></td>
                        </tr>
                        <tr>
                            <td>
                                <table id="chartHdr">
                                    <thead>
                                        <tr>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>Key: <xsl:value-of select="MusicChart/ChartHeader/ChartKey"/></td>
                                            <td>Tempo: <xsl:value-of select="MusicChart/ChartHeader/ChartTempo"/></td>
                                            <td>Time: <xsl:value-of select="MusicChart/ChartHeader/ChartTime"/></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <br></br><br></br>
                <table id="chart" border="1" cellpadding="4" cellspacing="0">
                    <xsl:for-each select="MusicChart/ChartDetail">
                        <tr>
                        <xsl:for-each select="BarText">
                            <xsl:choose>
                                <xsl:when test="normalize-space(.)">
                                    <td><xsl:value-of select="."/></td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td>&#160;</td>
                                </xsl:otherwise>
                            </xsl:choose>
                            <xsl:if test="(position()mod 4) = 0">
                                <xsl:text disable-output-escaping="yes">&lt;/tr&gt;</xsl:text>
                                <xsl:text disable-output-escaping="yes">&lt;tr&gt;</xsl:text>
                            </xsl:if>
                        </xsl:for-each>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
<!-- Stylus Studio meta-information - (c) 2004-2009. Progress Software Corporation. All rights reserved.

<metaInformation>
	<scenarios>
		<scenario default="yes" name="Scenario1" userelativepaths="yes" externalpreview="no" url="..\..\..\..\..\..\..\Junk\Song 1.xml" htmlbaseurl="" outputurl="..\..\..\..\..\..\..\Junk\Song 1.html" processortype="saxon8" useresolver="yes"
		          profilemode="0" profiledepth="" profilelength="" urlprofilexml="" commandline="" additionalpath="" additionalclasspath="" postprocessortype="none" postprocesscommandline="" postprocessadditionalpath="" postprocessgeneratedext=""
		          validateoutput="no" validator="internal" customvalidator="">
			<advancedProp name="sInitialMode" value=""/>
			<advancedProp name="bXsltOneIsOkay" value="true"/>
			<advancedProp name="bSchemaAware" value="true"/>
			<advancedProp name="bXml11" value="false"/>
			<advancedProp name="iValidation" value="0"/>
			<advancedProp name="bExtensions" value="true"/>
			<advancedProp name="iWhitespace" value="0"/>
			<advancedProp name="sInitialTemplate" value=""/>
			<advancedProp name="bTinyTree" value="true"/>
			<advancedProp name="bWarnings" value="true"/>
			<advancedProp name="bUseDTD" value="false"/>
			<advancedProp name="iErrorHandling" value="fatal"/>
		</scenario>
	</scenarios>
	<MapperMetaTag>
		<MapperInfo srcSchemaPathIsRelative="yes" srcSchemaInterpretAsXML="no" destSchemaPath="" destSchemaRoot="" destSchemaPathIsRelative="yes" destSchemaInterpretAsXML="no"/>
		<MapperBlockPosition></MapperBlockPosition>
		<TemplateContext></TemplateContext>
		<MapperFilter side="source"></MapperFilter>
	</MapperMetaTag>
</metaInformation>
-->