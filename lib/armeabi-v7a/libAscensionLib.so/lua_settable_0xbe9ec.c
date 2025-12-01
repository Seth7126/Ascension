// 函数: lua_settable
// 地址: 0xbe9ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = arg1[4]
void* const r1

if (arg2 s>= 1)
    r1 = &data_1d13d0
    void* r0_2 = *r0 + (arg2 << 4)
    
    if (r0_2 u< arg1[2])
        r1 = r0_2
else if (arg2 s>= 0xfff0b9d9)
    r1 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r0_8 = *r0
    
    if (r0_8[2] != 0x16)
        void* r0_9 = *r0_8
        r1 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r0_9 + 6)))
            r1 = r0_9 + ((0xfff0b9d8 - arg2) << 4)
    else
        r1 = &data_1d13d0
else
    r1 = arg1[3] + 0x28

int32_t r0_5 = arg1[2]
int32_t r8
sub_de974(arg1, r1, r0_5 - 0x20, r0_5 - 0x10, r8)
int32_t result = arg1[2] - 0x20
arg1[2] = result
return result
