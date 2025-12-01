// 函数: sub_d7740
// 地址: 0xd7740
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r4 = arg2
int32_t* r5 = arg1
sub_cab68(r4, arg2[7])
int32_t r1_1 = r4[7]

if (r1_1 != 0)
    r4[4] = &r4[0x12]
    void* i_1 = r4[0x15]
    r4[0x15] = 0
    
    if (i_1 != 0)
        void* i
        
        do
            i = *(i_1 + 0xc)
            r4 = sub_d14cc(r4, i_1, 0x28, 0)
            i_1 = i
        while (i != 0)
        r1_1 = r4[7]
    
    r4, r5 = sub_d14cc(r4, r1_1, r4[8] << 4, 0)

return sub_d14cc(r5, r4, 0x70, 0) __tailcall
