/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.core.kernel;

import wrapper.util.CLFileReader;

/**
 *
 * @author user
 */
public class CLSource {
    public static String[] readFiles()
    {
        String source1      = CLFileReader.readFile(CLSource.class, "Matrix.cl");
        String source2      = CLFileReader.readFile(CLSource.class, "Sampling.cl");
        String source3      = CLFileReader.readFile(CLSource.class, "Common.cl"); 
        String source4      = CLFileReader.readFile(CLSource.class, "RGBSpace.cl");
        String source5      = CLFileReader.readFile(CLSource.class, "Frame.cl");
        String source6      = CLFileReader.readFile(CLSource.class, "Material.cl");
        String source7      = CLFileReader.readFile(CLSource.class, "Primitive.cl");
        String source8      = CLFileReader.readFile(CLSource.class, "NormalBVH.cl");
        String source9      = CLFileReader.readFile(CLSource.class, "Path.cl");
        String source10      = CLFileReader.readFile(CLSource.class, "ScanCompact.cl");
        String source11     = CLFileReader.readFile(CLSource.class, "Initialize.cl");
        String source12     = CLFileReader.readFile(CLSource.class, "Raytracing.cl");
        String source13     = CLFileReader.readFile(CLSource.class, "Rendering.cl");
        
        return new String[]{source1, source2, source3, source4, source5, source6, 
            source7, source8, source9, source10, source11, source12, source13} ;
    }
}
