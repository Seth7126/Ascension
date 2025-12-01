// 函数: _ZN26CReliableTCPConnectionIPV613SendHeartbeatEv
// 地址: 0xbc2d4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *__stack_chk_guard
int32_t var_7e8 = 0xabcdef0
int32_t var_7ec = 8
int32_t var_7e4 = 0xffffffff
OutgoingTCPMessage* entry_r0
int32_t result = CReliableTCPConnectionIPV6::Send(entry_r0)

if (*__stack_chk_guard == r1)
    return result

__stack_chk_fail()
noreturn
