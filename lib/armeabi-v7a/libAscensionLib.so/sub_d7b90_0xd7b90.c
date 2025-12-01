// 函数: sub_d7b90
// 地址: 0xd7b90
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

arg1[3]
sub_cab68(arg1, arg1[7])
sub_cb2f8(arg1)
void* r0_1 = arg1[3]
int32_t* r4_1
void* r5_1
r4_1, r5_1 = sub_d14cc(arg1, *(r0_1 + 0x18), *(r0_1 + 0x20) << 2, 0)
int32_t r0_5
int32_t* r4_2
int32_t* r5_2
r0_5, r4_2, r5_2 = sub_d14cc(r4_1, *(r5_1 + 0x90), *(r5_1 + 0x98), 0)
r5_2[0x24] = r0_5
r5_2[0x26] = 0
int32_t r1_3 = r4_2[7]

if (r1_3 != 0)
    r4_2[4] = &r4_2[0x12]
    void* i_1 = r4_2[0x15]
    r4_2[0x15] = 0
    
    if (i_1 != 0)
        void* i
        
        do
            i = *(i_1 + 0xc)
            r4_2 = sub_d14cc(r4_2, i_1, 0x28, 0)
            i_1 = i
        while (i != 0)
        r1_3 = r4_2[7]
    
    r4_2, r5_2 = sub_d14cc(r4_2, r1_3, r4_2[8] << 4, 0)

r5_2[1]
jump(*r5_2)
