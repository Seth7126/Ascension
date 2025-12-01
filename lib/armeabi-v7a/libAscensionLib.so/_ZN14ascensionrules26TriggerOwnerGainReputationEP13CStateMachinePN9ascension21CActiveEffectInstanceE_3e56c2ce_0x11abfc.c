// 函数: _ZN14ascensionrules26TriggerOwnerGainReputationEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11abfc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r5 = *(arg3 + 0xc)
char* r6 = r5[1]
ascension::CPlayer::AddReputationLevel(r5)
return core::CWorldBase::OutputMessageFormat(r6, "%s gains %d reputation from %s\n", 
    (*(*r5 + 0xc))(r5), arg5, (*(*arg3 + 0xc))(arg3))
