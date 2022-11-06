# CSCI 338 - Project 3 Collaboration

This is the upstream main repo for project 3 collaboration and work together with group members.
The project will focus on working with graphs and building java scripts to code the graphs for specific functions.

GitHub Code Setup & Repo Connection:
'''
git clone https://github.com/Jzavarelli/csci-338-fall2022-project3.git

git pull

git add . 
git commit -m "commit-message"
git push

'''

 You can clone the repo openly due to the public nature of our repository, which means we do not want to source this GitHub to other members willingly.

 You pull a repo first to update every time, then can *git add .* to add every item from your repo branch. Finally, you can easily commit with a message, which should try to not have spaces, and then push to the main branch.

Expect error conflicts as it will occur when two branches merge to main.

## Project 3 Objectives

 Our project allows us to create four algoirthms that address NP-Complete problems from our lectures and homeworks. Building these would help us to understand the lectures and problems that we are solving. Each problem, in theory, is P = NP and if it is a P problem then it can be an NP-Complete Problem.

1. exactVC - This algorithm is going to find the optimal vertex covers that exist in our graph. VertexCover is an algorithm, which is proven to be NP complete, and P complete. VertexCover shows us the *total allowed cover of Vertexes* within a graph (See Lectures from Week 11).
2. inexactVC - This algorithm will find the least optimal vertex covers, but will run in polynomial time. *Non-trivial solutions* are the only possible route we can take.
3. exactIS - This algorithm finds the optimal independent set in our graph. This means that our algorithm will search through a graph and find the *set of vertices that are independent* from all other vertices around it (See lectures from Week 11).
4. inexactIS - This algorithm finds the least optimal independent sets, and must be ran in polynomial time. *Non-trivial solutions* are the only possible route we can take.

After our four methods are complete and the project is fully functional, we must work as a group to write a *report addressing the four methods we create, and the theoretical running time of our exact and inexact algorithms.* This final document will be easy to write but will include the run time proofs that are address in our lectures, and will be a very structured and formalized document.

## Project 3 Tools

The following are a list of resources that have been granted to us to start the project. The following two java classes are essential to building new methods that can help us in the project.

1. Graph.java - The following java class is an adjancey list converter. This class takes documents, graph files, and converts them into adjacency list for our usage. *This class may not be changed or edited in any way.*
2. GraphToolBox.java - The following class is our driver and main class that we will be editing. The class is full of static methods that we may edit and utilize to create our four methods, as per our requirements. We *cannot change any of the four main method headers* inside of the following class, as they are the main classes used in Graph.java.