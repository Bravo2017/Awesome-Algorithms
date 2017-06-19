import unicodecsv

def get_count(filename):
    return len(filename)
    
def get_unique_count(filename):
    unique = []
    for row in filename:
        if 'account_key' in row:
            if row['account_key'] not in unique:
                unique.append(row['account_key'])
        else:
            if row['acct'] not in unique:
                unique.append(row['acct'])
    return len(unique)
        

def read_csv(filename):
    with open(filename, 'rb') as f:
        reader = unicodecsv.DictReader(f)
        return list(reader)

enrollments = read_csv('/datasets/ud170/udacity-students/enrollments.csv')
daily_engagement = read_csv('/datasets/ud170/udacity-students/daily_engagement.csv')
project_submissions = read_csv('/datasets/ud170/udacity-students/project_submissions.csv')
    
### For each of these three tables, find the number of rows in the table and
### the number of unique students in the table. To find the number of unique
### students, you might want to create a set of the account keys in each table.

enrollment_num_rows = get_count(enrollments)             # Replace this with your code
enrollment_num_unique_students = get_unique_count(enrollments)  # Replace this with your code
print(enrollment_num_rows)
print(enrollment_num_unique_students)

engagement_num_rows = get_count(daily_engagement)             # Replace this with your code
engagement_num_unique_students = get_unique_count(daily_engagement)  # Replace this with your code
print(engagement_num_rows)
print(engagement_num_unique_students)

submission_num_rows = get_count(project_submissions)             # Replace this with your code
submission_num_unique_students = get_unique_count(project_submissions)  # Replace this with your code
print(submission_num_rows)
print(submission_num_unique_students)