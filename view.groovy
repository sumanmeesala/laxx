package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()

def viewName = 'Athena'
jenkins.addView (new ListView(viewName))

myView = hudson.model.Hudson.instance.getView(viewName)
myView.doAddJobToView('Athena_cc_trigger') 
myView.doAddJobToView('bt_nodes_decrease') 
myView.doAddJobToView('course_lineage_athena_builder_main') 
myView.doAddJobToView('course_playlist_accumulated_bloom_filter_builder_main') 
myView.doAddJobToView('course_playlist_bloom_filter_builder_main') 
myView.doAddJobToView('courses_main') 
myView.doAddJobToView('course_subject_accumulated_bloom_filter_builder_main') 
myView.doAddJobToView('course_subject_bloom_filter_builder_main') 
myView.doAddJobToView('course_subject_builder_main') 
myView.doAddJobToView('course_time_line_builder_athena_main') 
myView.doAddJobToView('delete_data_proc_cluster') 
myView.doAddJobToView('employee_department_timeline_builder_main_athena') 
myView.doAddJobToView('employee_dim_attributes_builder_main_athena') 
myView.doAddJobToView('employee_life_time_learning_time_line_builder_athena_main') 
myView.doAddJobToView('employee_location_timeline_builder_main_athena') 
myView.doAddJobToView('employee_transition_timeline_builder_main_athena') 
myView.doAddJobToView('learning_popularity_athena_data_builder_main') 
myView.doAddJobToView('learning_popularity_cube_cardinality_builder_main_athena') 
myView.doAddJobToView('learning_popularity_cube_cardinality_nc_builder_main') 
myView.doAddJobToView('learning_popularity_cube_data_builder_main_athena') 
myView.doAddJobToView('learning_popularity_cube_data_list_builder_main_couse_athena') 
myView.doAddJobToView('learning_popularity_cube_user_builder_main_athena') 
myView.doAddJobToView('learning_popularity_cube_user_builder_main_athena_t_option') 
myView.doAddJobToView('learning_popularity_cube_user_nc_builder_main') 
myView.doAddJobToView('learning_popularity_cube_user_nc_builder_main_t_option') 
myView.doAddJobToView('learning_popularity_nc_athena_data_builder_main') 
myView.doAddJobToView('learning_popularity_nc_cube_data_builder_main') 
myView.doAddJobToView('learning_popularity_nc_cube_data_list_builder_main') 
myView.doAddJobToView('mlp_cluster_compute_time_stamp_main_athena') 
myView.doAddJobToView('org_unit_hierarchy_builder_main_athena_corpwise') 
myView.doAddJobToView('ou_substitution_builder_main_athena') 
myView.doAddJobToView('playlist_recommendations_builder_main') 
myView.doAddJobToView('playlist_recommendations_nc_builder_main') 
myView.doAddJobToView('subject_recommendations_builder_main') 
myView.doAddJobToView('subject_recommendations_nc_builder_main') 
myView.doAddJobToView('user_lo_latest_lo_version_substitution_builder_main_athena') 


jenkins.save()
