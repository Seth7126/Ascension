// 函数: _ZN14ascensionrules33CStateDiscardAllMonsterConstructs10EnterStateER13CStateMachine
// 地址: 0x13c37c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r7 = *(arg1 + 0x38)
int32_t* i = *(r7 + 0x54)
int32_t result

for (result = *(r7 + 0x58); i != result; i = &i[1])
    void* r4_1 = *i
    
    if (*(*(*(r4_1 + 0x10) + 0xc) + 0x88) == 3)
        void** r0_3 = operator new(0x3c)
        CState::CState()
        *r0_3 = _vtable_for_ascensionrules::CStateDiscardConstruct + 8
        r0_3[0xc] = r7
        r0_3[0xd] = r4_1
        r0_3[0xe].b = 0
        CState::AddOwnedChild(arg1)
        CStateList::AppendState(arg1)
        r7 = *(arg1 + 0x38)
    
    result = *(r7 + 0x58)

return result
