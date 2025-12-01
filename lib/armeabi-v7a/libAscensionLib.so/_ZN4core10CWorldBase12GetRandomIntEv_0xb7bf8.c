// 函数: _ZN4core10CWorldBase12GetRandomIntEv
// 地址: 0xb7bf8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r0 = *(entry_r0 + 0x9fc)

if (r0 == 0)
    CRandomGenerator::ReloadValues()
    r0 = *(entry_r0 + 0x9fc)

int32_t* r1 = *(entry_r0 + 0x9f8)
*(entry_r0 + 0x9f8) = &r1[1]
*(entry_r0 + 0x9fc) = r0 - 1
int32_t r0_3 = *r1
int32_t r0_4 = r0_3 ^ r0_3 u>> 0xb
int32_t r0_5 = (0x9d2c5680 & r0_4 << 7) ^ r0_4
int32_t r0_6 = (0xefc60000 & r0_5 << 0xf) ^ r0_5
return r0_6 ^ r0_6 u>> 0x12
