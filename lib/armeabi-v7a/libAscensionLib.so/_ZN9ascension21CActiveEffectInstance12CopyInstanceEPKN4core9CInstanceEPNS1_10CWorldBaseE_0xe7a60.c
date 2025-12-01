// 函数: _ZN9ascension21CActiveEffectInstance12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xe7a60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(arg1 + 0xc) = *(arg2 + 0xc)
*(*(arg2 + 0x10) + 8)
uint32_t entry_r2
*(arg1 + 0x10) = core::CWorldBase::GetInstanceByID(entry_r2)
void* r0_4 = *(arg2 + 0x14)
int32_t r0_6

if (r0_4 == 0)
    r0_6 = 0
else
    *(r0_4 + 8)
    r0_6 = core::CWorldBase::GetInstanceByID(entry_r2)

*(arg1 + 0x14) = r0_6
int32_t r0_7 = *(arg2 + 0x18)
*(arg1 + 0x18) = r0_7

if (r0_7 != 0)
    void* __offset(core::CInstance, 0x5c) r6_1 = arg1 + 0x5c
    void* __offset(core::CWorldBase, 0x5c) r7_1 = arg2 + 0x5c
    int32_t i = 0
    
    do
        strcpy(r6_1 - 0x40, r7_1 - 0x40)
        i += 1
        *r6_1 = *r7_1
        int32_t r0_10 = *(r7_1 + 4)
        r7_1 += 0x48
        *(r6_1 + 4) = r0_10
        r6_1 += 0x48
    while (i u< *(arg1 + 0x18))

*(arg1 + 0x13c) = *(arg2 + 0x13c)
*(arg1 + 0x140) = *(arg2 + 0x140)
int32_t result = *(arg2 + 0x148)
int32_t r1_3 = *(arg2 + 0x14c)
*(arg1 + 0x148) = result
*(arg1 + 0x14c) = r1_3
return result
