/*
 * Copyright (c) 2015, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * @test
 * @bug 8044537
 * @summary Checking ACC_SYNTHETIC flag is generated for assert statement.
 * @modules jdk.compiler/com.sun.tools.javac.api
 *          jdk.compiler/com.sun.tools.javac.main
 * @library /tools/lib /tools/javac/lib ../lib
 * @build toolbox.ToolBox InMemoryFileManager TestResult TestBase
 * @build AssertFieldTest SyntheticTestDriver ExpectedClass ExpectedClasses
 * @run main SyntheticTestDriver AssertFieldTest
 */

/**
 * Synthetic field for assert.
 */
@ExpectedClass(className = "AssertFieldTest",
        expectedMethods = {"<init>()", "function(boolean)", "<clinit>()"},
        expectedNumberOfSyntheticFields = 1)
public class AssertFieldTest {

    public void function(boolean flag) {
        assert flag;
    }
}
