// 函数: _ZN16CRandomGenerator12ReloadValuesEv
// 地址: 0xb75e8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r0
int32_t lr = *entry_r0

for (int32_t i = 0; i != 0x38c; i += 4)
    void* r1_1 = entry_r0 + i
    int32_t r3_1 = *(r1_1 + 4)
    int32_t r1_3 = (r3_1 & 0x7ffffffe) | (lr & 0x80000000)
    lr = r3_1
    int32_t r1_4 = *(r1_1 + 0x634) ^ r1_3 u>> 1
    
    if ((r3_1 & 1) != 0)
        r1_4 ^= 0x9908b0df
    
    *(entry_r0 + i) = r1_4

int32_t r4_2 = entry_r0[0xe3]

for (int32_t i_1 = 0; i_1 != 0xfffffe74; )
    void* r1_6 = entry_r0 - (i_1 << 2)
    i_1 -= 1
    int32_t r3_2 = *(r1_6 + 0x390)
    int32_t r5_3 = *r1_6 ^ ((r3_2 & 0x7ffffffe) | (r4_2 & 0x80000000)) u>> 1
    r4_2 = r3_2
    
    if ((r3_2 & 1) != 0)
        r5_3 ^= 0x9908b0df
    
    *(r1_6 + 0x38c) = r5_3

int32_t r2 = *entry_r0
int32_t r1_10 = entry_r0[0x18c] ^ ((r2 & 0x7ffffffe) | (entry_r0[0x26f] & 0x80000000)) u>> 1

if ((r2 & 1) != 0)
    r1_10 ^= 0x9908b0df

entry_r0[0x26f] = r1_10
entry_r0[0x270] = entry_r0
entry_r0[0x271] = 0x270
