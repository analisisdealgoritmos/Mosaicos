import numpy as np
import matplotlib.pyplot as plt

x = [8,16,32,64,120]
y = [0.00298,0.00498,0.0116,0.0224,0.067]

plt.plot(x,y)
plt.xlabel('Input Size')
plt.ylabel('Tiempo de ejecucion promedio')
plt.title('Proyecto Mosaicos')
plt.legend()
plt.show()