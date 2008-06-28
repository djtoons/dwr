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
package org.directwebremoting.extend;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * A way to convert {@link BufferedImage}s to files so they can be written
 * using a FileServingServlet or similar.
 * @author Joe Walker [joe at getahead dot ltd dot uk]
 */
public class InputStreamFileGenerator extends AbstractFileGenerator
{
    /**
     * Setup the image to convert
     * @param in the data to stream
     * @param mimeType The mime type to convert the image into
     */
    public InputStreamFileGenerator(InputStream in, String filename, String mimeType)
    {
        super(filename, mimeType);
        this.in = in;
    }

    /* (non-Javadoc)
     * @see org.directwebremoting.extend.DownloadManager.FileGenerator#generateFile(java.io.OutputStream)
     */
    public void generateFile(OutputStream out) throws IOException
    {
        byte[] buffer = new byte[1024];
        while (true)
        {
            int length = in.read(buffer);
            if (length == -1)
            {
                break;
            }
            out.write(buffer, 0, length);
        }
    }

    /**
     * The stream that we are about to export
     */
    protected final InputStream in;
}