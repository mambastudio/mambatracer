# Mamba Tracer

A simple Java OpenCL Tracer mainly targeting OpenCL 1.2 with AMD and Intel Drivers. The goal is to have a High Performance Computing (HPC) java ray tracer that utilizes the opencl hardware available in any hardware/platform. Other vectorization hardware support will be considered in the future depending on Java adoption of vector data/operations. Also, the ease of use of the ray tracer is another main goal, whereby the User Interface (UI) will be easy in operation, with the ability to upload wavefront objects (future option is the glTF model scene). Another goal is to attract developers in contribution of the code where improvements are highly necessary in order to grow an ecosystem of developers based on the software and field of ray tracing. 

![Alt text](screenshot.png?raw=true "Title")

## Features

* Intuitive UI
* Memory efficient data storage (use of only Java primitives (float, int) for mesh and bvh)
* Interactive camera control
* Raytracing done on GPU only, targeting Intel and AMD Drivers
* Currently targeting OpenCL 1.2 platform (OpenCL 2.0 is not currently supported by majority of drivers)
* Stackless traversal - https://voxelium.wordpress.com/2013/11/21/stackless-multi-bvh-traversal-for-cpu-mic-and-gpu-ray-tracing/

## Dependencies

* JOCL Library http://www.jocl.org/

## Future Implementation
* Enhance UI
  - Use of WorkbenchFX UI framework - https://github.com/dlsc-software-consulting-gmbh/WorkbenchFX
* Fast Acceleration Structure   
  - Fast Build BVH
    - Parallel Locally-Ordered Clustering for Bounding Volume Hierarchy Construction
      - https://dcgi.felk.cvut.cz/projects/ploc/ploc-tvcg.pdf
      - http://www.tut.fi/vga/publications/PLOCTree_A_Fast_High-Quality_Hardware_BVH_Builder.html
  - Fast Traversal & Build
    - GPU Ray Tracing using Irregular Grids (solves teapot in a stadium problem) - https://graphics.cg.uni-saarland.de/index.php?id=939
* Global illumination (Path tracing & BDPT)
  - Best implementation I've come across - https://github.com/SmallVCM/SmallVCM
  - Light Vertex Cache for GPU implementation of BDPT - https://cgg.mff.cuni.cz/~jaroslav/papers/2014-gpult/index.htm
* Environment map
  - Sunsky
  - HDR
  - Adaptive environment map sampling without use of portals - https://cgg.mff.cuni.cz/~jaroslav/papers/2018-adaptiveibl/index.htm
* Intuitive and simple material editor  
  - Arbitrary Layered BSDFs 
    - Fastest unbiased monte-carlo simulation of layered bsdfs - https://shuangz.com/projects/layered-sa18/
* Scene Description
  - GL Transmission Format (glTF) as main scene format - https://github.com/KhronosGroup/glTF
  - Improve OBJ File format reading 
    - Additional feature reading
    - Multithreading based on ideas from:
      - https://github.com/syoyo/tinyobjloader/blob/master/experimental/tinyobj_loader_opt.h
      - https://github.com/antonmks/nvParse
