package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()

def viewName = 'Athna'
jenkins.addView (new ListView(viewName))

myView = hudson.model.Hudson.instance.getView(viewName)
myView.doAddJobToView('athna_cc_trigger') 
myView.doAddJobToView('bt_nodes_decrease') 
myView.doAddJobToView('course_lineage_athna_b_m') 
myView.doAddJobToView('course_playlist_accumulated_bloom_filter_b_m') 
myView.doAddJobToView('course_playlist_bloom_filter_b_m') 
myView.doAddJobToView('courses_m') 
myView.doAddJobToView('course_subject_accumulated_bloom_filter_b_m') 
myView.doAddJobToView('course_subject_bloom_filter_b_m') 
myView.doAddJobToView('course_subject_b_m') 
myView.doAddJobToView('course_time_line_b_athna_m') 
myView.doAddJobToView('delete_data_proc_cluster') 
myView.doAddJobToView('employee_department_timeline_b_m_athna') 
myView.doAddJobToView('employee_dim_attributes_b_m_athna') 
myView.doAddJobToView('employee_life_time_learning_time_line_b_athna_m') 
myView.doAddJobToView('employee_location_timeline_b_m_athna') 
myView.doAddJobToView('employee_transition_timeline_b_m_athna') 
myView.doAddJobToView('learning_popularity_athna_data_b_m') 
myView.doAddJobToView('learning_popularity_cube_cardinality_b_m_athna') 
myView.doAddJobToView('learning_popularity_cube_cardinality_nc_b_m') 
myView.doAddJobToView('learning_popularity_cube_data_b_m_athna') 
myView.doAddJobToView('learning_popularity_cube_data_list_b_m_couse_athna') 
myView.doAddJobToView('learning_popularity_cube_user_b_m_athna') 
myView.doAddJobToView('learning_popularity_cube_user_b_m_athna_t_option') 
myView.doAddJobToView('learning_popularity_cube_user_nc_b_m') 
myView.doAddJobToView('learning_popularity_cube_user_nc_b_m_t_option') 
myView.doAddJobToView('learning_popularity_nc_athna_data_b_m') 
myView.doAddJobToView('learning_popularity_nc_cube_data_b_m') 
myView.doAddJobToView('learning_popularity_nc_cube_data_list_b_m') 
myView.doAddJobToView('mlp_cluster_compute_time_stamp_m_athna') 
myView.doAddJobToView('org_unit_hierarchy_b_m_athna_corpwise') 
myView.doAddJobToView('ou_substitution_b_m_athna') 
myView.doAddJobToView('playlist_recommendations_b_m') 
myView.doAddJobToView('playlist_recommendations_nc_b_m') 
myView.doAddJobToView('subject_recommendations_b_m') 
myView.doAddJobToView('subject_recommendations_nc_b_m') 
myView.doAddJobToView('user_lo_latest_lo_version_substitution_b_m_athna') 


jenkins.save()
