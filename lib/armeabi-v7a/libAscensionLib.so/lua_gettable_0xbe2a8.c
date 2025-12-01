// 函数: lua_gettable
// 地址: 0xbe2a8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r3_5 = arg1[4]
int32_t* r1

if (arg2 s>= 1)
    r1 = &data_1d13d0
    int32_t* r2_1 = *r3_5 + (arg2 << 4)
    
    if (r2_1 u< arg1[2])
        r1 = r2_1
else if (arg2 s>= 0xfff0b9d9)
    r1 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r3_3 = *r3_5
    
    if (r3_3[2] != 0x16)
        void* r3_4 = *r3_3
        r1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r3_4 + 6)))
            r1 = r3_4 + ((0xfff0b9d8 - arg2) << 4)
    else
        r1 = &data_1d13d0
else
    r1 = arg1[3] + 0x28

int32_t* r2_3 = arg1[2] - 0x10
return sub_de7c0(arg1, r1, r2_3, r2_3) __tailcall
