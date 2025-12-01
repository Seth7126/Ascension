// 函数: lua_len
// 地址: 0xbf8d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = arg1[4]
void* const r2

if (arg2 s>= 1)
    r2 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< arg1[2])
        r2 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r2 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_7 = *r0
    
    if (r0_7[2] != 0x16)
        void* r0_8 = *r0_7
        r2 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_8 + 6)))
            r2 = r0_8 + ((0xfff0b9d8 - arg2) << 4)
    else
        r2 = &data_1d13d0
else
    r2 = arg1[3] + 0x28

sub_df734(arg1, arg1[2], r2)
int32_t result = arg1[2] + 0x10
arg1[2] = result
return result
