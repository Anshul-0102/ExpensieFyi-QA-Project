import pandas as pd

def summarize_test_cases(file_path):
    df = pd.read_csv(file_path)
    total_cases = len(df)
    modules = df['Module'].unique()
    summary = f'Total Test Cases: {total_cases}\nModules Covered: {", ".join(modules)}'
    return summary

if __name__ == "__main__":
    summary = summarize_test_cases('../manual/Functional_Test_Cases.csv')
    print(summary)
