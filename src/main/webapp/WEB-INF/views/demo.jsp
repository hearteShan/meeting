<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="e" uri="org.topteam/easyui" %>

<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>jeasyui - The JSP component library for EasyUI </title>
    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico">
    <script type="text/javascript" src="static/jquery.min.js"></script>
    <e:resources location="../../static/easyui1.4.1" theme="metro"/>
    <e:resource location="static" name="demo.css"/>
    <script>
        function menuTreeClick(node) {
            var tabs = $("#center-tabs");
            if (tabs.tabs('exists', node.text)) {
                tabs.tabs('select', node.text);
                var tab = tabs.tabs('getSelected');
                if (tab && tab.find('iframe').length > 0) {
                    var _refresh_iframe = tab.find('iframe')[0];
                    var refresh_url = node.href ? node.href : _refresh_iframe.src;
                    _refresh_iframe.contentWindow.location.href = refresh_url;
                }
            } else {
                var content;
                var scroll = false;
                if (node.href && node.href.indexOf('#') < 0) {
                    content = '<iframe frameborder="0"  src="' + node.href
                    + '" style="width:100%;height:100%;"></iframe>';
                    tabs.tabs('add', {
                        title: node.text,
                        id: node.id,
                        content: content,
                        iconCls: node.iconCls,
                        closable: true
                    });
                } else {
                    console.info(node);
                }

            }

        }

    </script>
</head>
<e:body>
    <e:layout id="main" fit="true">
        <e:layoutUnit region="north" style="height:60px">
            <img src="logo.png" height="45" width="45" style="float: left;margin-top: 6px;margin-left: 28px;"/>
            <a class="logo" href="#">TOP<span>TEAM</span></a>
            <a href="document.jsp" style="float :right; font-size: 20px;">文档</a>
        </e:layoutUnit>
        <e:layoutUnit region="west" style="width:200px" title="主菜单" split="true">
            <e:accordion id="menu" fit="true">
                <e:tab title="通用">
                    <e:tree id="commTree">
                        <e:treeNode text="JSP模板" href="tags/Template.jsp"/>
                        <e:treeNode text="综合界面" href="demos.jsp"/>
                        <e:treeNode text="Facet"/>
                        <e:treeNode text="Event"/>
                        <e:treeNode text="EventListener"/>
                        <e:treeNode text="Push Demo" href="tags/PushDemo.jsp"/>
                        <e:eventListener event="onClick" listener="menuTreeClick"/>
                    </e:tree>
                </e:tab>
                <e:tab title="页面布局" style="padding:5px;">
                    <e:tree id="layoutTree">
                        <e:treeNode text="布局Layout">
                            <e:treeNode text="基本布局" href="tags/Layout.jsp"/>
                            <e:treeNode text="布局动作" href="tags/LayoutAction.jsp"/>
                            <e:treeNode text="嵌套布局" href="tags/LayoutComplex.jsp"/>
                        </e:treeNode>
                        <e:treeNode text="面板Panel">
                            <e:treeNode text="Panel Basic" href="tags/Panel.jsp"/>
                            <e:treeNode text="Panel Tools" href="tags/PanelTools.jsp"/>
                            <e:treeNode text="Custom Tools" href="tags/PanelCustomTools.jsp"/>
                            <e:treeNode text="Load Content" href="tags/PanelLoadContent.jsp"/>
                            <e:treeNode text="Nested Panel" href="tags/PanelNested.jsp"/>
                        </e:treeNode>
                        <e:treeNode text="Tabs">
                            <e:treeNode text="Tabs Basic" href="tags/TabsBasic.jsp"/>
                            <e:treeNode text="Nested Tabs" href="tags/TabsNested.jsp"/>
                            <e:treeNode text="Tabs Tools" href="tags/TabsTools.jsp"/>
                            <e:treeNode text="Tab Position" href="tags/TabPosition.jsp"/>
                            <e:treeNode text="Tabs Custom" href="tags/TabsCustom.jsp"/>
                        </e:treeNode>
                        <e:treeNode text="Accordion">
                            <e:treeNode text="Accordion Basic" href="tags/AccordionBasic.jsp"/>
                            <e:treeNode text="Accordion Tools" href="tags/AccordionTools.jsp"/>
                            <e:treeNode text="Accordion Actions" href="tags/AccordionActions.jsp"/>
                            <e:treeNode text="Keep Expandable" href="tags/AccordionExpanded.jsp"/>
                        </e:treeNode>
                        <e:eventListener event="onClick" listener="menuTreeClick"/>
                    </e:tree>
                </e:tab>
                <e:tab title="菜单按钮" style="padding:5px;">
                    <e:tree id="menuButton">
                        <e:treeNode text="菜单menu">
                            <e:treeNode text="基本菜单" href="tags/MenuBasic.jsp"/>
                            <e:treeNode text="自定义菜单" href="tags/MenuCustom.jsp"/>
                            <e:treeNode text="菜单事件" href="tags/MenuEvent.jsp"/>
                        </e:treeNode>
                        <e:treeNode text="按钮">
                            <e:treeNode text="Button Basic" href="tags/Button.jsp"/>
                        </e:treeNode>
                        <e:treeNode text="按钮菜单">
                            <e:treeNode text="MenuButton Basic" href="tags/MenuButtonBasic.jsp"/>
                        </e:treeNode>
                        <e:treeNode text="SplitButton">
                            <e:treeNode text="SplitButton Basic" href="tags/SplitButtonBasic.jsp"/>
                        </e:treeNode>
                        <e:eventListener event="onClick" listener="menuTreeClick"/>
                    </e:tree>
                </e:tab>
                <e:tab title="Form组件">
                    <e:tree id="formTree">
                        <e:treeNode text="Form">
                            <e:treeNode text="Form Basic" href="tags/FormBasic.jsp"/>
                            <e:treeNode text="Load Form Data"/>
                            <e:treeNode text="Validate on Submit"/>
                            <e:treeNode text="Ajax Form"/>
                        </e:treeNode>
                        <e:treeNode text="ValidateBox" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Custom Tooltip"/>
                        </e:treeNode>
                        <e:treeNode text="TextBox" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Clear Icon"/>
                            <e:treeNode text="Custom TextBox"/>
                            <e:treeNode text="TextBox with Icons"/>
                            <e:treeNode text="TextBox with Button"/>
                            <e:treeNode text="Multiline TextBox"/>
                        </e:treeNode>
                        <e:treeNode text="Combo" state="closed">
                            <e:treeNode text="Basic"/>
                        </e:treeNode>
                        <e:treeNode text="ComboBox" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Extra Icons"/>
                            <e:treeNode text="Load Dynamic ComboBox Data"/>
                            <e:treeNode text="Multiple Select"/>
                            <e:treeNode text="Navigation"/>
                            <e:treeNode text="Custom Format in ComboBox"/>
                            <e:treeNode text="Remote JSONP"/>
                        </e:treeNode>
                        <e:treeNode text="ComboTree" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Multiple ComboTree"/>
                            <e:treeNode text="ComboTree Actions"/>
                        </e:treeNode>
                        <e:treeNode text="ComboGrid" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Multiple ComboGrid"/>
                            <e:treeNode text="Navigation"/>
                            <e:treeNode text="ComboGrid Actions"/>
                            <e:treeNode text="Filter ComboGrid"/>
                        </e:treeNode>
                        <e:treeNode text="NumberBox" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Format NumberBox"/>
                            <e:treeNode text="Number Range"/>
                        </e:treeNode>
                        <e:treeNode text="Calendar" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="First Day of Week"/>
                            <e:treeNode text="Custom Calendar"/>
                            <e:treeNode text="Disable Calendar Date"/>
                        </e:treeNode>
                        <e:treeNode text="DateBox" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Date Format"/>
                            <e:treeNode text="DateBox Buttons"/>
                            <e:treeNode text="Validate DateBox"/>
                            <e:treeNode text="Restrict Date"/>
                            <e:treeNode text="DateBox Events"/>
                        </e:treeNode>
                        <e:treeNode text="DateTimeBox" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Initialize Value for DateTime"/>
                            <e:treeNode text="Display Seconds"/>
                        </e:treeNode>
                        <e:treeNode text="NumberSpinner" state="closed">
                            <e:treeNode text="Basic"/>
                        </e:treeNode>
                        <e:treeNode text="TimeSpinner" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Time Range"/>
                            <e:treeNode text="TimeSpinner Actions"/>
                        </e:treeNode>
                        <e:treeNode text="Slider" state="closed">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Slider Rule"/>
                            <e:treeNode text="Format Tip Information"/>
                            <e:treeNode text="Vertical Slider"/>
                            <e:treeNode text="Non Linear Slider"/>
                        </e:treeNode>
                        <e:treeNode text="FileBox" state="closed">
                            <e:treeNode text="Basic"/>
                        </e:treeNode>
                        <e:eventListener event="onClick" listener="menuTreeClick"/>
                    </e:tree>
                </e:tab>
                <e:tab title="Window">
                    <e:tree id="windowTree">
                        <e:treeNode text="Window">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Custom Window Tools"/>
                            <e:treeNode text="Inline Window"/>
                            <e:treeNode text="Modal Window"/>
                            <e:treeNode text="Window Layout"/>
                        </e:treeNode>
                        <e:treeNode text="Dialog">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Toolbar and Buttons"/>
                            <e:treeNode text="Complex Toolbar on Dialog"/>
                        </e:treeNode>
                        <e:treeNode text="Messager">
                            <e:treeNode text="Basic"/>
                            <e:treeNode text="Alert Messager"/>
                            <e:treeNode text="Interactive Messager"/>
                            <e:treeNode text="Message Box Position"/>
                        </e:treeNode>
                        <e:eventListener event="onClick" listener="menuTreeClick"/>
                    </e:tree>
                </e:tab>
                <e:tab title="DataGrid and Tree">
                    <e:tree id="dataTree">
                        <e:treeNode text="DataGrid">
                            <e:treeNode text="Basic DataGrid"/>
                            <e:treeNode text="Transform DataGrid from Table"/>
                            <e:treeNode text="Row Border"/>
                            <e:treeNode text="......"/>
                        </e:treeNode>
                        <e:treeNode text="Tree">
                            <e:treeNode text="Basic Tree"/>
                            <e:treeNode text="Animation Tree"/>
                            <e:treeNode text="CheckBox Tree"/>
                            <e:treeNode text="......"/>
                        </e:treeNode>
                        <e:treeNode text="TreeGrid">
                            <e:treeNode text="Basic TreeGrid"/>
                            <e:treeNode text="TreeGrid Lines"/>
                            <e:treeNode text="TreeGrid Actions"/>
                            <e:treeNode text="......"/>
                        </e:treeNode>
                        <e:eventListener event="onClick" listener="menuTreeClick"/>
                    </e:tree>
                </e:tab>
            </e:accordion>
        </e:layoutUnit>
        <e:layoutUnit region="center">
            <e:tabs id="center-tabs" fit="true" border="false">
                <e:tab id="home" title="首页" style="padding: 0px; overflow: hidden; border: 0px;">
                    <iframe style="width:100%;height:100%;overflow: hidden;" src="center.jsp" frameborder="0"></iframe>
                </e:tab>
            </e:tabs>
        </e:layoutUnit>
    </e:layout>
</e:body>
</html>
