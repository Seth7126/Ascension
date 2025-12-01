// 函数: _ZN14ascensionrules26CStateProcessAcquirePortal26SelectAcquireToDiscardPileER13CStateMachineP6CStateiPj
// 地址: 0x160a60
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (arg3 == 0)
    return 

int32_t lr
int32_t var_4 = lr
uint32_t r2 = *(arg2 + 0x254)
ascension::CPlayer* r6 = *(arg2 + 0x24c)

if (r2 == 7)
    int32_t r4_1 = *(r6 + 4)
    ascension::CWorld::RemoveCenterRowCard(r4_1, (*(arg2 + 0x258)).b)
    ascension::CWorld::PutCardOnCenterRow(r4_1, *(arg2 + 0x258), arg3)
    r2 = *(arg2 + 0x254)

ascensionrules::CreateStateProcessAcquireCardSequence(r6, arg3, r2, *(arg2 + 0x258), 3, nullptr, 0)
return CStateMachine::PushOwnedState(arg1) __tailcall
