// 函数: _ZN20NetworkClientManager14SetMonitorGameEP12AppWorldData
// 地址: 0x185228
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r1
bool cond:1 = entry_r1 == 0
int32_t r2 = *__stack_chk_guard
*(arg1 + 0x50c) = *(arg1 + 0x508)

if (entry_r1 != 0)
    entry_r1 = *(entry_r1 + 4)

int32_t* r2_2 = *(arg1 + 4)

if (cond:1)
    entry_r1 = 1

*(arg1 + 0x520) = entry_r1

if (r2_2 != 0)
    int32_t var_1c_1 = 0
    int32_t var_20 = 0x81818181
    void* var_18_1 = entry_r1
    (*(*r2_2 + 8))(r2_2, &var_20, 0xc)

int32_t r0_2 = *__stack_chk_guard

if (r0_2 == r2)
    return r0_2 - r2

__stack_chk_fail()
noreturn
