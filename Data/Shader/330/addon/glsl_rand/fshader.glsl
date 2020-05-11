#version 330

uniform float t;

out vec4 fs_out_color;

float rand(vec2 co){
    return fract(sin(dot(co.xy,vec2(12.9898,78.233)))*43758.5453);
}

void main(){
    float disp=rand(gl_FragCoord.xy*fract(t));
    vec2 co1=gl_FragCoord.xy+vec2(disp,disp);
    vec2 co2=gl_FragCoord.xy+vec2(disp,-disp);
    vec2 co3=gl_FragCoord.xy+vec2(-disp,disp);

    float r=rand(co1);
    float g=rand(co2);
    float b=rand(co3);

    fs_out_color=vec4(r,g,b,1.0);
}
