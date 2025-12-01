// 函数: lua_next
// 地址: 0xbf774
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r2 = arg1[4]
void* const r0

if (arg2 s>= 1)
    r0 = &data_1d13d0
    void* r1 = *r2 + (arg2 << 4)
    
    if (r1 u< arg1[2])
        r0 = r1
else if (arg2 s>= 0xfff0b9d9)
    r0 = arg1[2] + (arg2 << 4)
else if (arg2 != 0xfff0b9d8)
    int32_t* r2_4 = *r2
    
    if (r2_4[2] != 0x16)
        void* r2_5 = *r2_4
        r0 = &data_1d13d0
        
        if (0xfff0b9d8 - arg2 s<= zx.d(*(r2_5 + 6)))
            r0 = r2_5 + ((0xfff0b9d8 - arg2) << 4)
    else
        r0 = &data_1d13d0
else
    r0 = arg1[3] + 0x28

int32_t result = sub_da838(arg1, *r0, arg1[2] - 0x10)
int32_t r2_3 = 0x10

if (result == 0)
    r2_3 = 0xfffffff0

arg1[2] += r2_3
return result
