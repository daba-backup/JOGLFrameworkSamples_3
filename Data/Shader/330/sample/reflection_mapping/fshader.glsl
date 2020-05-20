#version 330

struct Camera{
    vec3 position;
    vec3 target;
    mat4 projection;
    mat4 view_transformation;
    float near;
    float far;
};

uniform Camera camera;

uniform sampler2D texture_sampler;
uniform samplerCube cubemap;

in vec3 vs_out_position;
in vec2 vs_out_uv;
in vec3 vs_out_normal;
out vec4 fs_out_color;

void main(){
    vec3 ref=reflect(vs_out_position-camera.position,vs_out_normal);
    vec4 env_color=textureCube(cubemap,ref);
    env_color.a=1.0;

    fs_out_color=texture(texture_sampler,vs_out_uv)*env_color;
}