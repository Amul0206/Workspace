import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

# Load dataset
# Assuming you have a CSV file with columns 'size' and 'price'
data = pd.read_csv('house_prices.csv')

# Prepare the data
X = data[['size']]  # Feature
y = data['price']   # Target

# Split the data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create and train the model
model = LinearRegression()
model.fit(X_train, y_train)

# Make predictions
y_pred = model.predict(X_test)

# Evaluate the model
mse = mean_squared_error(y_test, y_pred)
print(f'Mean Squared Error: {mse}')

# Predict the price of a new house
new_house_size = np.array([[1500]])  # Example size in square feet
predicted_price = model.predict(new_house_size)
print(f'Predicted price for a house with size 1500 sq ft: ${predicted_price[0]:.2f}')