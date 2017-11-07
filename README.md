![perlin noise java](https://pierpaololucarellidotcom.files.wordpress.com/2017/08/thumb.png)
original algorithm: 
> http://mrl.nyu.edu/~perlin/noise/

How it works
------------

 1. Define a grid of vectors

Divide the plane in a grid of **n** x **m** squares and create a 2D vector (x,y) in each square.
The angle of this vector will be given by a 3D Perlin noise algorithm, where the 3 dimensions are respectively: **x coordinate**, **y coordinate** and **time**. We will use these vectors to guide our particle's direction and velocity in the plane.

 2. Create and place particles in the plane

A set of particles are created and dropped on to the plane at a random point. Each particle object is described by three 2D vector attributes: position, velocity and acceleration. To move the particle, simply add the velocity vector to the position vector. 

3. Apply the forces on the gird to the particles

For every frame of the animation, each vector of the grid is applied as a force to the particles on that particular grid square. This will cause the particles to move in the direction of the vector flow field.

![perlin noise java](https://pierpaololucarellidotcom.files.wordpress.com/2017/09/screen-shot-2017-09-25-at-13-03-031.png?w=359&h=203&zoom=2)
![perlin noise java](https://pierpaololucarellidotcom.files.wordpress.com/2017/09/perln2.png?w=372&h=203&zoom=2)
