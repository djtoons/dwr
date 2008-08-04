/*
 * Copyright 2005 Joe Walker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.directwebremoting.server.jetty;

import org.directwebremoting.servers.jetty.JettyLauncherBase;

/**
 * Launch Jetty embedded for demoing Spring DWR integration.
 * @author Joe Walker [joe at getahead dot org]
 */
public class JettySpringTestLauncher
{
    /**
     * Just create and launch an instance of Jetty
     */
    public static void main(String[] args) throws Exception
    {
        JettyLauncherBase launcher = new JettyLauncherBase("target/ant/web/spring/test", "/test-dwr-spring", 8080);
        launcher.start();
    }
}