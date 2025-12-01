// 函数: lua_getfield
// 地址: 0xbe360
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = arg1[4]
void* const r5

if (arg2 s>= 1)
    r5 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< arg1[2])
        r5 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r5 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_12 = *r0
    
    if (r0_12[2] != 0x16)
        void* r0_13 = *r0_12
        r5 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_13 + 6)))
            r5 = r0_13 + ((0xfff0b9d8 - arg2) << 4)
    else
        r5 = &data_1d13d0
else
    r5 = arg1[3] + 0x28

int32_t* r6 = arg1[2]
void* r0_6 = sub_d807c(arg1, arg3)
*r6 = r0_6
r6[2] = zx.d(*(r0_6 + 4)) | 0x40
int32_t* r2 = arg1[2]
arg1[2] = &r2[4]
return sub_de7c0(arg1, r5, r2, r2) __tailcall
