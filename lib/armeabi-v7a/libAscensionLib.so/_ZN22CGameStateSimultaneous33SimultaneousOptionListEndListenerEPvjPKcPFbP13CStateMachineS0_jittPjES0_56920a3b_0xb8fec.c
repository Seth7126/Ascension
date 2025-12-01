// 函数: _ZN22CGameStateSimultaneous33SimultaneousOptionListEndListenerEPvjPKcPFbP13CStateMachineS0_jittPjES0_
// 地址: 0xb8fec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg1 == 0)
    return 

uint32_t r12_1 = *(arg1 + 0x30)

if (r12_1 == 0)
    return 

int32_t lr = *(arg1 + 0x34)

if (lr s>= 1)
    void* r5_1 = arg1 + 0x64
    int32_t r6_1 = 0
    
    do
        if (*(r5_1 - 0xc) == arg2)
            *(r5_1 - 4) = arg4
            *r5_1 = arg5
            break
        
        r6_1 += 1
        r5_1 += 0x30
    while (r6_1 s< lr)

void* var_20 = arg1
CStateMachine::HandleOptionListEnd(r12_1, arg2, arg3, CGameStateSimultaneous::SelectOptionCallback)
