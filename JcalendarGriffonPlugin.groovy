/*
 * griffon-jcalendar: JCalendar Griffon plugin
 * Copyright 2010 and beyond, Andres Almiray
 *
 * JCalendar is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

/**
 * @author Andres Almiray
 */
class JcalendarGriffonPlugin {
    // the plugin version
    String version = '0.3'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU LGPL 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-jcalendar-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Date & Calendar support'
    String description = '''
Provides date & Calendar support via [JCalendar][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*        | *Type*                                  |
| ------------- | --------------------------------------- |
| calendar      | `com.toedter.calendar.JCalendar`        |
| dateChooser   | `com.toedter.calendar.JDateChooser`     |
| dayChooser    | `com.toedter.calendar.JDayChooser`      |
| monthChooser  | `com.toedter.calendar.JMonthChooser`    |
| yearChooser   | `com.toedter.calendar.JYearChooser`     |
| localeChooser | `com.toedter.components.JLocaleChooser` |
| spinField     | `com.toedter.components.JSpinField`     |

All JCalendar beans are designed as proper Java Beans. Please refer to the [JCalendar API documentation][2] to know more about the 
properties that can be set on these beans.

[1]: http://jeuclid.sourceforge.net/index.html
[2]: http://www.toedter.com/en/jcalendar/api/index.html
'''
}


